package com.netsensia.utils

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type;
import java.io.File
import java.util.stream.Collectors.groupingBy


fun main(args: Array<String>) {

    val messageFile = args[0]
    val eventName = args[1]
    val text = File(messageFile).readText()
    val listType: Type = object : TypeToken<List<DlqMessage?>?>() {}.type
    val dlqMessages = Gson().fromJson<List<DlqMessage>>(text, listType)

    val namedEvents = dlqMessages.filter{ it.msgContent._metadata.name.equals(eventName) }.toList()

    report(eventName, namedEvents)
}

private fun report(eventName: String, namedEvents: List<DlqMessage>) {

    header("$eventName count: ${namedEvents.size}")
    val consumerMap = namedEvents.stream().collect(groupingBy(DlqMessage::consumer))

    consumerMap.forEach {
        header("Consumer")

        println("${it.key} ${it.value.size}".replace("\\", ""))

        header("Message IDs")
        it.value.forEach { print("${it.msgContent._metadata.id},") }
        println()

        header("Event IDs")
        it.value.forEach { print("${it.msgContent._metadata.event.eventNumber},") }

        println()
    }
}

private fun header(headerText: String) {
    println("----------------------------------------------------------")
    println(headerText)
    println("----------------------------------------------------------")
}