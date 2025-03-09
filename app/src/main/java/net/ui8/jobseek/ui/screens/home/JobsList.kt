package net.ui8.jobseek.ui.screens.home

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import net.ui8.jobseek.data.jobs.models.Job
import net.ui8.jobseek.data.jobs.sample.SampleJobs
import net.ui8.jobseek.ui.theme.JobseekTheme
import net.ui8.jobseek.ui.theme.Padding

@Composable
fun JobsList(
    jobs: List<Job>,
) {
    LazyColumn(
        modifier = Modifier
            .padding(horizontal = Padding.Medium)
    ) {
        items(
            count = jobs.size,
            key = { index ->
                jobs[index].id
            },
            itemContent = { index ->
                JobListItem(
                    job = jobs[index]
                )
            }
        )
    }
}

@Composable
@Preview
fun JobsListPreview() {
    JobseekTheme(darkTheme = false) {
        Surface {
            JobsList(
                jobs = SampleJobs.popular,
            )
        }
    }
}
