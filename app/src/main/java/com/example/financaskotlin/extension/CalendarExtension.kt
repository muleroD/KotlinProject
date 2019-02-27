package com.example.financaskotlin.extension

import java.text.SimpleDateFormat
import java.util.*

fun Calendar.dataBr(): String {
    val formatBR = "dd/MM/yyyy"
    val format = SimpleDateFormat(formatBR)
    return format.format(this.time)
}