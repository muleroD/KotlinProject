package com.example.financaskotlin.extension

fun String.limitaString(caracteres: Int): String {
    if (this.length > caracteres) {
        return "${this.substring(0, caracteres)} . . . "
    }
    return this;
}