package net.ui8.jobseek.ui.screens.tabs

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import net.ui8.jobseek.R
import net.ui8.jobseek.navigation.TabsScreen

enum class Tab(
    @StringRes
    val title: Int,
    @DrawableRes
    val icon: Int,
    val screen: TabsScreen,
) {

    HOME(
        title = R.string.home,
        icon = R.drawable.ic_home,
        screen = TabsScreen.Home,
    ),
    MESSAGES(
        title = R.string.messages,
        icon = R.drawable.ic_mail,
        screen = TabsScreen.Messages,
    ),
    SAVED(
        title = R.string.saved,
        icon = R.drawable.ic_bookmark,
        screen = TabsScreen.Saved,
    ),
    NOTIFICATIONS(
        title = R.string.notifications,
        icon = R.drawable.ic_window,
        screen = TabsScreen.Notifications,
    )
}
