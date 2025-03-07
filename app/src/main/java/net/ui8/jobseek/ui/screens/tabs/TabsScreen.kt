package net.ui8.jobseek.ui.screens.tabs

import androidx.compose.runtime.Composable

@Composable
fun TabsScreen() {
    val tabs = Tab.entries
    TabsContent(
        tabs = tabs,
    )
}
