package net.ui8.jobseek.data.jobs.models

enum class RatePeriod(
    val symbol: Char,
) {
    PER_HOUR(
        symbol = 'h',
    ),
    PER_MONTH(
        symbol = 'm',
    ),
    PER_YEAR(
        symbol = 'y',
    ),
}
