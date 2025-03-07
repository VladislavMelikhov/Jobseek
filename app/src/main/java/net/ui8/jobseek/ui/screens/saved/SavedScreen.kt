package net.ui8.jobseek.ui.screens.saved

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun SavedScreen(
    viewModel: SavedViewModel = viewModel<SavedViewModel>()
) {
    viewModel.doSomething()
    SavedContent()
}
