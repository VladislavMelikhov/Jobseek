package net.ui8.jobseek.ui.screens.tabs

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

@Composable
fun TabsScreen() {
    val tabs = Tab.entries
    var selectedTab: Tab by rememberSaveable {
        mutableStateOf(Tab.HOME)
    }
    TabsContent(
        tabs = tabs,
        selectedTab = selectedTab,
        onTabClick = { clickedTab ->
            selectedTab = clickedTab
        },
    )
}
