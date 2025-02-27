package net.ui8.jobseek.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import net.ui8.jobseek.ui.screens.tabs.TabsScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Tabs,
    ) {
        composable<Screen.Tabs> {
            TabsScreen()
        }
    }
}
