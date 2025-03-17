package net.ui8.jobseek.ui.screens.home.items

import net.ui8.jobseek.data.jobs.models.Job
import net.ui8.jobseek.data.jobs.models.JobCategory
import net.ui8.jobseek.ui.screens.home.jobs.row.JobsUiItemsConverter
import net.ui8.jobseek.ui.screens.home.jobs.row.JobsUiItemsConverterImpl

class HomeUiItemsConverterImpl(
    private val jobsUiItemsConverter: JobsUiItemsConverter = JobsUiItemsConverterImpl(),
) : HomeUiItemsConverter {

    override fun convertToUiItems(
        popularJobs: List<Job>,
        recommendedJobs: List<Job>,
    ): List<HomeUiItem> =
        buildList {
            add(
                HomeUiItem.HeaderItem(
                    jobCategory = JobCategory.POPULAR,
                )
            )
            addAll(
                popularJobs.map(HomeUiItem::JobItem)
            )
            add(
                HomeUiItem.HeaderItem(
                    jobCategory = JobCategory.RECOMMENDED,
                )
            )
            add(
                HomeUiItem.HorizontalSectionItem(
                    jobCategory = JobCategory.RECOMMENDED,
                    uiItems = jobsUiItemsConverter.convertToUiItems(recommendedJobs)
                )
            )
        }
}
