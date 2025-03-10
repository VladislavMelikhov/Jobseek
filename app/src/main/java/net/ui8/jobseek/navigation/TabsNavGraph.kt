package net.ui8.jobseek.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import net.ui8.jobseek.ui.screens.home.HomeScreen
import net.ui8.jobseek.ui.screens.messages.MessagesScreen
import net.ui8.jobseek.ui.screens.notifications.NotificationsScreen
import net.ui8.jobseek.ui.screens.saved.SavedScreen

@Composable
fun SetupTabsNavGraph(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = TabsScreen.Home,
    ) {
        composable<TabsScreen.Home> {
            HomeScreen()
        }
        composable<TabsScreen.Messages> {
            MessagesScreen()
        }
        composable<TabsScreen.Saved> {
            SavedScreen()
        }
        composable<TabsScreen.Notifications> {
            NotificationsScreen()
        }
    }
}
