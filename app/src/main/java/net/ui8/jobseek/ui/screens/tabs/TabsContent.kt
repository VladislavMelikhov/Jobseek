package net.ui8.jobseek.ui.screens.tabs

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import net.ui8.jobseek.ui.theme.JobseekTheme

@Composable
fun TabsContent(
    tabs: List<Tab>,
    selectedTab: Tab,
    onTabClick: (Tab) -> Unit
) {
    Scaffold(
        content = { padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = "Tabs Screen",
                )
            }
        },
        bottomBar = {
            BottomNavigationBar(
                tabs = tabs,
                selectedTab = selectedTab,
                onTabClick = onTabClick,
            )
        }
    )
}

@Composable
private fun BottomNavigationBar(
    tabs: List<Tab>,
    selectedTab: Tab,
    onTabClick: (Tab) -> Unit
) {
    NavigationBar {
        tabs.forEach { tab ->
            val isSelectedTab: Boolean =
                (tab == selectedTab)

            val icon: ImageVector =
                if (isSelectedTab) {
                    tab.selectedIcon
                } else {
                    tab.unselectedIcon
                }

            val label: String =
                stringResource(tab.title)

            NavigationBarItem(
                selected = isSelectedTab,
                onClick = { onTabClick(tab) },
                icon = {
                    Icon(
                        imageVector = icon,
                        contentDescription = label,
                    )
                },
                label = {
                    Text(text = label)
                }
            )
        }
    }
}

@Composable
@Preview
private fun TabsContentPreview() {
    JobseekTheme(darkTheme = true) {
        TabsContent(
            tabs = Tab.entries,
            selectedTab = Tab.MESSAGES,
            onTabClick = {},
        )
    }
}
