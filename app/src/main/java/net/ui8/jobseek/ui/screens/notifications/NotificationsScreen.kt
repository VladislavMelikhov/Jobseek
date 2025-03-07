package net.ui8.jobseek.ui.screens.notifications

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun NotificationsScreen(
    viewModel: NotificationsViewModel = viewModel<NotificationsViewModel>()
) {
    viewModel.doSomething()
    NotificationsContent()
}
