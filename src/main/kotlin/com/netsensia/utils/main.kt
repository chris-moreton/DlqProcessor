package com.netsensia.utils

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type;
import java.io.File
import java.time.ZonedDateTime
import java.util.*
import java.util.stream.Collectors.groupingBy

fun main() {

    val messageFile = "../dlqs.json"
    val text = File(messageFile).readText()
    val listType: Type = object : TypeToken<List<DlqMessage?>?>() {}.type
    val dlqMessages = Gson().fromJson<List<DlqMessage>>(text, listType)
    val eventNames = dlqMessages
        .distinctBy { it.msgContent._metadata.name }
        .map { it.msgContent._metadata.name }.toList()

    val eventCounts = mutableMapOf<String, Int>()

    eventNames.forEach { eventName ->
        eventCounts.put(eventName, dlqMessages.filter{ it.msgContent._metadata.name.equals(eventName) }.toList().count())
        // report(eventName, namedEvents)
    }

    val sortedByCount = eventCounts.toSortedMap(compareBy<String> { -eventCounts[it]!! }.thenBy { it })

    recents(dlqMessages, days = 2)

    sortedByCount.forEach {
        print( it.value.toString().padStart(6) )
        print(" ")
        println( it.key )
    }
}

private fun recents(dlqMessages: List<DlqMessage>, days: Long) {
    val streamIds = mutableListOf<UUID>()

    dlqMessages.filter { it.msgContent._metadata.name.equals("public.sjp.case-resulted") }.forEach { dlq ->
        val streamId = dlq.msgContent._metadata.stream.id
        val time = ZonedDateTime.parse(dlq.msgContent._metadata.createdAt)
        val oneDayAgo = ZonedDateTime.now().minusDays(days)
        if (!streamIds.contains(streamId) && time.isAfter(oneDayAgo)) {
            streamIds.add(streamId)
            println("\"${streamId}\",\"${time}\"")
        }
    }
}

private fun report(eventName: String, namedEvents: List<DlqMessage>) {

    header("$eventName count: ${namedEvents.size}")
    val consumerMap = namedEvents.stream().collect(groupingBy(DlqMessage::consumer))

    println("Number of distinct consumers: ${consumerMap.entries.size}")

    consumerMap.forEach {
        val consumer = "${it.key} ${it.value.size}".replace("\\", "")

        header("Message IDs for consumer $consumer ")
        it.value.forEach { print("${it.msgContent._metadata.id},") }
        println()

        header("Event IDs for consumer $consumer")
        it.value.forEach { print("${it.msgContent._metadata.event.eventNumber},") }

        println()
        println()
    }
}

private fun header(headerText: String) {
    println("----------------------------------------------------------")
    println(headerText)
    println("----------------------------------------------------------")
}