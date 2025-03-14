package net.ui8.jobseek.ui.screens.home

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import kotlinx.serialization.Serializable
import net.ui8.jobseek.R
import net.ui8.jobseek.data.jobs.models.Job
import net.ui8.jobseek.utils.uiItem.UiItem

sealed interface JobsUiItem : UiItem<JobsUiItem.Id> {

    data class HeaderItem(
        val jobsCount: Int,
    ) : JobsUiItem

    data class JobItem(
        val job: Job,
    ) : JobsUiItem

    override val id: Id
        get() = when (this) {
            is HeaderItem -> Id.HeaderItem
            is JobItem -> Id.JobItem(job.id)
        }

    @Composable
    override fun ItemContent() {
        when (this) {
            is HeaderItem -> JobsHeaderItem(
                text = stringResource(R.string.popular_jobs)
            )
            is JobItem -> JobsColumnItem(
                job = job
            )
        }
    }

    @Serializable
    sealed interface Id {
        @Serializable
        data object HeaderItem : Id
        @Serializable
        data class JobItem(val jobId: Long) : Id
    }
}
