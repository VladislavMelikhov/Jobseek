package net.ui8.jobseek.data.jobs.models

data class JobLocation(
    val country: String,
    val province: String?,
    val city: String?,
) {

    fun toDisplayString(): String =
        listOf(city, province, country)
            .filter { str -> !str.isNullOrBlank() }
            .joinToString(separator = ", ")
}
