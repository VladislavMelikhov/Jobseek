package net.ui8.jobseek.ui.screens.home.items

import net.ui8.jobseek.data.jobs.models.Job

interface HomeUiItemsConverter {

    fun convertToUiItems(
        popularJobs: List<Job>,
        recommendedJobs: List<Job>,
    ): List<HomeUiItem>
}
