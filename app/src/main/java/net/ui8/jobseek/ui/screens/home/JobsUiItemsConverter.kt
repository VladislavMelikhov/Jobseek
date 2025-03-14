package net.ui8.jobseek.ui.screens.home

import net.ui8.jobseek.data.jobs.models.Job

object JobsUiItemsConverter {

    fun convertToUiItems(
        jobs: List<Job>
    ): List<JobsUiItem> =
        buildList {
            add(
                JobsUiItem.HeaderItem(
                    jobsCount = jobs.size
                )
            )
            addAll(
                jobs.map(JobsUiItem::JobItem)
            )
        }
}
