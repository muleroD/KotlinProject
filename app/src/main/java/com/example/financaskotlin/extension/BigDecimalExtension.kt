package com.example.financaskotlin.extension

import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.*

fun BigDecimal.moedaBr(): String {
    val numberFormatBR = DecimalFormat.getCurrencyInstance(Locale("pt", "br"))
    val moedaFormat = numberFormatBR.format(this).replace("R$", "R$ ")

    return moedaFormat
}

