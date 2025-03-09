package net.ui8.jobseek.ui.screens.tabs

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                tab.screen.route == currentDestination?.route
            }
            BottomNavigationBar(
                tabs = tabs,
                selectedTab = selectedTab,
                onTabClick = { clickedTab ->
                    if (clickedTab != selectedTab) {
                        navController.navigate(clickedTab.screen) {
                            if (selectedTab != null) {
                                popUpTo(selectedTab.screen.route) {
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
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surfaceContainer
    ) {
        tabs.forEach { tab ->
            val isSelectedTab: Boolean =
                (tab == selectedTab)

            val icon: Painter =
                painterResource(tab.icon)

            val label: String =
                stringResource(tab.title)

            NavigationBarItem(
                selected = isSelectedTab,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = MaterialTheme.colorScheme.primary,
                    unselectedIconColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    indicatorColor = Color.Transparent,
                ),
                onClick = { onTabClick(tab) },
                icon = {
                    Icon(
                        painter = icon,
                        contentDescription = label,
                    )
                },
                label = {
                    val circleColor: Color =
                        if (isSelectedTab) {
                            MaterialTheme.colorScheme.primary
                        } else {
                            Color.Transparent
                        }

                    Canvas(
                        modifier = Modifier
                            .size(5.dp),
                    ) {
                        drawCircle(color = circleColor)
                    }

                }
            )
        }
    }
}

@Composable
@Preview
private fun BottomNavigationBarPreview() {
    JobseekTheme(darkTheme = true) {
        BottomNavigationBar(
            tabs = Tab.entries,
            selectedTab = Tab.HOME,
            onTabClick = {},
        )
    }
}
