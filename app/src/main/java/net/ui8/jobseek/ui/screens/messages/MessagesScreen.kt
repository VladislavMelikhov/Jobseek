package net.ui8.jobseek.ui.screens.messages

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun MessagesScreen(
    viewModel: MessagesViewModel = viewModel<MessagesViewModel>()
) {
    viewModel.doSomething()
    MessagesContent()
}
