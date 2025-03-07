package net.ui8.jobseek.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed interface MainScreen : Screen {

    @Serializable
    data object Tabs : MainScreen
}
