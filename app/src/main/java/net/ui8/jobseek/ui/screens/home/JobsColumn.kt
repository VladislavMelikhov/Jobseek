package net.ui8.jobseek.ui.screens.home

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import net.ui8.jobseek.data.jobs.sample.SampleJobs
import net.ui8.jobseek.ui.theme.JobseekTheme
import net.ui8.jobseek.ui.theme.Padding

@Composable
fun JobsColumn(
    uiItems: List<JobsUiItem>,
) {
    LazyColumn(
        modifier = Modifier
            .padding(horizontal = Padding.Medium)
    ) {
        items(
            contentType = { index ->
                uiItems[index].id.javaClass.canonicalName
            },
            key = { index ->
                uiItems[index].id.toString()
            },
            count = uiItems.size,
            itemContent = { index ->
                uiItems[index].ItemContent()
            }
        )
    }
}

@Composable
@Preview
fun JobsColumnPreview() {
    JobseekTheme(darkTheme = false) {
        Surface {
            JobsColumn(
                uiItems = SampleJobs.popular
                    .let(JobsUiItemsConverter::convertToUiItems)
            )
        }
    }
}
