package net.ui8.jobseek.ui.screens.home.jobs.row

import net.ui8.jobseek.data.jobs.models.Job

class JobsUiItemsConverterImpl : JobsUiItemsConverter {

    override fun convertToUiItems(
        jobs: List<Job>
    ): List<JobsUiItem> =
        buildList {
            addAll(
                jobs.map(JobsUiItem::JobItem)
            )
        }
}
