package net.ui8.jobseek.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed interface Screen {

    @Serializable
    data object Tabs : Screen
}
