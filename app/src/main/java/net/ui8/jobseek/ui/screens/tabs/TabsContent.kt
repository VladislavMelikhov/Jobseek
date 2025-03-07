package net.ui8.jobseek.ui.screens.tabs

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import net.ui8.jobseek.navigation.SetupTabsNavGraph
import net.ui8.jobseek.ui.theme.JobseekTheme

@Composable
fun TabsContent(
    tabs: List<Tab>,
) {
    val navController = rememberNavController()
    Scaffold(
        content = { padding ->
            Box(
                modifier = Modifier.padding(padding),
            ) {
                SetupTabsNavGraph(
                    navController = navController
                )
            }
        },
        bottomBar = {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentDestination = navBackStackEntry?.destination
            val selectedTab = tabs.firstOrNull { tab ->
                tab.correspondingScreen.route == currentDestination?.route
            }
            BottomNavigationBar(
                tabs = tabs,
                selectedTab = selectedTab,
                onTabClick = { clickedTab ->
                    if (clickedTab != selectedTab) {
                        navController.navigate(clickedTab.correspondingScreen) {
                            if (selectedTab != null) {
                                popUpTo(selectedTab.correspondingScreen.route) {
                                    inclusive = true
                                }
                            }
                        }
                    }
                },
            )
        }
    )
}

@Composable
private fun BottomNavigationBar(
    tabs: List<Tab>,
    selectedTab: Tab?,
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
        )
    }
}
