package net.ui8.jobseek.ui.screens.tabs

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import net.ui8.jobseek.ui.theme.JobseekTheme

@Composable
fun TabsContent() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Tabs Screen",
        )
    }
}

@Composable
@Preview
private fun TabsContentPreview() {
    JobseekTheme(darkTheme = false) {
        TabsContent()
    }
}
