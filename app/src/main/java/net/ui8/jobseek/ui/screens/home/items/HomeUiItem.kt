package net.ui8.jobseek.ui.screens.home.items

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import kotlinx.serialization.Serializable
import net.ui8.jobseek.data.jobs.models.Job
import net.ui8.jobseek.data.jobs.models.JobCategory
import net.ui8.jobseek.ui.screens.home.jobs.column.JobsColumnItem
import net.ui8.jobseek.ui.screens.home.jobs.column.JobsHeaderItem
import net.ui8.jobseek.ui.screens.home.jobs.row.JobsRow
import net.ui8.jobseek.ui.screens.home.jobs.row.JobsUiItem
import net.ui8.jobseek.utils.uiItem.UiItem

sealed interface HomeUiItem : UiItem<HomeUiItem.Id> {

    data class HeaderItem(
        val jobCategory: JobCategory,
    ) : HomeUiItem

    data class JobItem(
        val job: Job,
    ) : HomeUiItem

    data class HorizontalSectionItem(
        val jobCategory: JobCategory,
        val uiItems: List<JobsUiItem>,
    ) : HomeUiItem

    override val id: Id
        get() = when (this) {
            is HeaderItem -> Id.HeaderItem(jobCategory)
            is JobItem -> Id.JobItem(job.id)
            is HorizontalSectionItem -> Id.HorizontalSectionItem(jobCategory)
        }

    @Composable
    override fun ItemContent() {
        when (this) {
            is HeaderItem -> JobsHeaderItem(
                text = stringResource(jobCategory.titleId)
            )
            is JobItem -> JobsColumnItem(
                job = job
            )
            is HorizontalSectionItem -> JobsRow(
                uiItems = uiItems
            )
        }
    }

    @Serializable
    sealed interface Id {
        @Serializable
        data class HeaderItem(val jobCategory: JobCategory) : Id
        @Serializable
        data class JobItem(val jobId: Long) : Id
        @Serializable
        data class HorizontalSectionItem(val jobCategory: JobCategory) : Id
    }
}
