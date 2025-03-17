package net.ui8.jobseek.ui.screens.home.jobs.row

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import kotlinx.serialization.Serializable
import net.ui8.jobseek.data.jobs.models.Job
import net.ui8.jobseek.ui.screens.home.jobs.column.JobsHeaderItem
import net.ui8.jobseek.utils.uiItem.UiItem

sealed interface JobsUiItem : UiItem<JobsUiItem.Id> {

    data class JobItem(
        val job: Job,
    ) : JobsUiItem

    override val id: Id
        get() = when (this) {
            is JobItem -> Id.JobItem(job.id)
        }

    @Composable
    override fun ItemContent() {
        when (this) {
            is JobItem -> JobsRowItem(
                job = job
            )
        }
    }

    @Serializable
    sealed interface Id {
        @Serializable
        data class JobItem(val jobId: Long) : Id
    }
}
