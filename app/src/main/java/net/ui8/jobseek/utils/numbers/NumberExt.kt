package net.ui8.jobseek.utils.numbers

fun Number.formatDecimalSeparator(): String =
    toString()
        .reversed()
        .chunked(3)
        .joinToString(",")
        .reversed()
