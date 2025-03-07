package net.ui8.jobseek.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed interface TabsScreen : Screen {

    @Serializable
    data object Home : TabsScreen

    @Serializable
    data object Messages : TabsScreen
}
