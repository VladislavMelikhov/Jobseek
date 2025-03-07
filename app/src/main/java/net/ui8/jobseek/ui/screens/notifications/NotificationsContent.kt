package net.ui8.jobseek.ui.screens.notifications

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
fun NotificationsContent() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Notifications Tab",
        )
    }
}

@Composable
@Preview
private fun NotificationsContentPreview() {
    JobseekTheme(darkTheme = true) {
        NotificationsContent()
    }
}
