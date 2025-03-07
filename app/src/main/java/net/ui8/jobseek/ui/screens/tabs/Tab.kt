package net.ui8.jobseek.ui.screens.tabs

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.ui.graphics.vector.ImageVector
import net.ui8.jobseek.R
import net.ui8.jobseek.navigation.TabsScreen

enum class Tab(
    @StringRes
    val title: Int,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val correspondingScreen: TabsScreen,
) {

    HOME(
        title = R.string.home,
        selectedIcon = Icons.Filled.Home,
        unselectedIcon = Icons.Outlined.Home,
        correspondingScreen = TabsScreen.Home,
    ),
    MESSAGES(
        title = R.string.messages,
        selectedIcon = Icons.Filled.Email,
        unselectedIcon = Icons.Outlined.Email,
        correspondingScreen = TabsScreen.Messages,
    ),
    SAVED(
        title = R.string.saved,
        selectedIcon = Icons.Filled.Favorite,
        unselectedIcon = Icons.Outlined.FavoriteBorder,
        correspondingScreen = TabsScreen.Saved,
    ),
    NOTIFICATIONS(
        title = R.string.notifications,
        selectedIcon = Icons.Filled.Notifications,
        unselectedIcon = Icons.Outlined.Notifications,
        correspondingScreen = TabsScreen.Notifications,
    )
}
