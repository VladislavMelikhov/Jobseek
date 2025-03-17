package net.ui8.jobseek.ui.screens.home.jobs.row

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import net.ui8.jobseek.data.jobs.sample.SampleJobs
import net.ui8.jobseek.ui.theme.JobseekTheme
import net.ui8.jobseek.ui.theme.Padding

@Composable
fun JobsRow(
    uiItems: List<JobsUiItem>,
) {
    LazyRow(
        modifier = Modifier
            .padding(vertical = Padding.Medium)
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
private fun JobsRowPreview() {
    JobseekTheme(darkTheme = false) {
        val converter = JobsUiItemsConverterImpl()
        Surface {
            JobsRow(
                uiItems = SampleJobs.recommended
                    .let(converter::convertToUiItems)
            )
        }
    }
}
