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

    val SrDeveloperSpotify: Job =
        Job(
            id = 3,
            title = "Sr Developer",
            company = SampleCompanies.Spotify,
            salary = Salary(
                amount = 115_000,
                currency = Currency.USD,
                ratePeriod = RatePeriod.PER_YEAR,
            ),
            location = SampleLocations.Florida,
        )

    val JrExecutivePinterest: Job =
        Job(
            id = 4,
            title = "Jr Executive",
            company = SampleCompanies.Pinterest,
            salary = Salary(
                amount = 96_000,
                currency = Currency.USD,
                ratePeriod = RatePeriod.PER_YEAR,
            ),
            location = SampleLocations.LosAngels,
        )

    val UxDesignerDribble: Job =
        Job(
            id = 5,
            title = "UX Designer",
            company = SampleCompanies.Dribble,
            salary = Salary(
                amount = 80_000,
                currency = Currency.USD,
                ratePeriod = RatePeriod.PER_YEAR,
            ),
            location = SampleLocations.LosAngels,
        )

    val SrEngineerFacebook: Job =
        Job(
            id = 6,
            title = "Sr Engineer",
            company = SampleCompanies.Facebook,
            salary = Salary(
                amount = 96_000,
                currency = Currency.USD,
                ratePeriod = RatePeriod.PER_YEAR,
            ),
            location = SampleLocations.LosAngels,
        )

    val popular: List<Job> =
        listOf(
            JrExecutiveBurgerKing,
            ProductManagerBeats,
        )

    val recommended: List<Job> =
        listOf(
            SrDeveloperSpotify,
            JrExecutivePinterest,
            UxDesignerDribble,
            SrEngineerFacebook,
        )
}
