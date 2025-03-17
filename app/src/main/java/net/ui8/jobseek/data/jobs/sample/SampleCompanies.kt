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

    val Spotify: Company =
        Company(
            id = 3,
            name = "Spotify",
            logo = R.drawable.ic_spotify,
        )

    val Pinterest: Company =
        Company(
            id = 4,
            name = "Pinterest",
            logo = R.drawable.ic_pinterest,
        )

    val Dribble: Company =
        Company(
            id = 5,
            name = "Dribble",
            logo = R.drawable.ic_dribble,
        )

    val Facebook: Company =
        Company(
            id = 6,
            name = "Facebook",
            logo = R.drawable.ic_facebook,
        )
}
