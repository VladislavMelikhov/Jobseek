package net.ui8.jobseek.data.jobs.sample

import net.ui8.jobseek.R
import net.ui8.jobseek.data.jobs.models.Company

object SampleCompanies {

    val BurgerKing: Company =
        Company(
            id = 1,
            name = "Burger King",
            logo = R.drawable.ic_burger_king,
        )

    val Beats: Company =
        Company(
            id = 2,
            name = "Beats",
            logo = R.drawable.ic_beats,
        )
}
