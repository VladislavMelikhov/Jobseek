package net.ui8.jobseek.ui.screens.home.jobs.row

import net.ui8.jobseek.data.jobs.models.Job

interface JobsUiItemsConverter {

    fun convertToUiItems(
        jobs: List<Job>
    ): List<JobsUiItem>
}
