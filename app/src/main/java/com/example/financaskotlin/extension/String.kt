package com.example.financaskotlin.extension

fun String.limitaString(caracteres: Int): String {

    val caracterInicial: Int = 0

    if (this.length > caracteres) {
        return "${this.substring(caracterInicial, caracteres)} . . . "
    }
    return this;
}