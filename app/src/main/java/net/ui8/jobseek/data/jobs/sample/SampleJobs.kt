package net.ui8.jobseek.data.jobs.sample

import net.ui8.jobseek.data.jobs.models.Currency
import net.ui8.jobseek.data.jobs.models.Job
import net.ui8.jobseek.data.jobs.models.RatePeriod
import net.ui8.jobseek.data.jobs.models.Salary

object SampleJobs {

    val JrExecutiveBurgerKing: Job =
        Job(
            id = 1,
            title = "Jr Executive",
            company = SampleCompanies.BurgerKing,
            salary = Salary(
                amount = 96_000,
                currency = Currency.USD,
                ratePeriod = RatePeriod.PER_YEAR,
            ),
            location = SampleLocations.LosAngels,
        )

    val ProductManagerBeats: Job =
        Job(
            id = 2,
            title = "Product Manager",
            company = SampleCompanies.Beats,
            salary = Salary(
                amount = 84_000,
                currency = Currency.USD,
                ratePeriod = RatePeriod.PER_YEAR,
            ),
            location = SampleLocations.Florida,
        )


    val popular: List<Job> =
        listOf(
            JrExecutiveBurgerKing,
            ProductManagerBeats,
        )
}
