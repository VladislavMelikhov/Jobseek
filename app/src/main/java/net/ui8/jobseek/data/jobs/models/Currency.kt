package net.ui8.jobseek.data.jobs.models

enum class Currency(
    val code: String,
    val title: String,
    val symbol: Char?,
) {
    USD(
        code = "USD",
        title = "United States Dollar",
        symbol = '$',
    ),
    EUR(
        code = "EUR",
        title = "Euro",
        symbol = '€',
    ),
    RUB(
        code = "RUB",
        title = "Russian Ruble",
        symbol = '₽',
    ),
    BYN(
        code = "BYN",
        title = "Belarusian ruble",
        symbol = null,
    );

    fun symbolOrCode(): String =
        symbol?.toString() ?: code
}
