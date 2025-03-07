package net.ui8.jobseek.ui.screens.home

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = viewModel<HomeViewModel>()
) {
    viewModel.doSomething()
    HomeContent()
}
