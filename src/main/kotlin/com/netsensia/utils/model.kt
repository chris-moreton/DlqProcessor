package com.netsensia.utils

import java.time.ZonedDateTime
import java.util.*

data class Context(
    val user: UUID
)

data class Event(
    val eventNumber: Int,
    val previousEventNumber: Int
)

data class Stream(
    val id: UUID,
    val version: Int
)

data class MessageContent(
    val _metadata: MetaData
)

data class Correlation(
    val client: UUID
)

data class MetaData(
    val causation: List<UUID>,
    val context: Context,
    val correlation: Correlation,
    val createdAt: String,
    val event: Event,
    val id: UUID,
    val name: String,
    val source: String,
    val stream: Stream,

    )

data class DlqMessage(
    val consumer: String,
    val msgContent: MessageContent,
    val messageId: UUID,
    val originalDestination: String
)
