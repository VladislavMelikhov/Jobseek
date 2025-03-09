package net.ui8.jobseek.data.jobs.models

import net.ui8.jobseek.utils.numbers.formatDecimalSeparator

data class Job(
    val id: Long,
    val title: String,
    val company: Company,
    val salary: Salary,
    val location: JobLocation,
)

data class Salary(
    val amount: Long,
    val currency: Currency,
    val ratePeriod: RatePeriod,
) {

    fun toDisplayString(): String =
        "${currency.symbolOrCode()}${amount.formatDecimalSeparator()}/${ratePeriod.symbol}"
}
