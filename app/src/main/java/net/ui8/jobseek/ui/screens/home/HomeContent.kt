package net.ui8.jobseek.ui.screens.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import net.ui8.jobseek.data.jobs.sample.SampleJobs
import net.ui8.jobseek.ui.theme.JobseekTheme

@Composable
fun HomeContent() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        JobsList(jobs = SampleJobs.popular)
    }
}

@Composable
@Preview
private fun HomeContentPreview() {
    JobseekTheme(darkTheme = true) {
        HomeContent()
    }
}
