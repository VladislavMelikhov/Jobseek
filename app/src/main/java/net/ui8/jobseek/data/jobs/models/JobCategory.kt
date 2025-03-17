package net.ui8.jobseek.data.jobs.models

import androidx.annotation.StringRes
import net.ui8.jobseek.R

enum class JobCategory(
    @StringRes
    val titleId: Int,
) {

    FEATURED(
        titleId = R.string.featured_jobs,
    ),
    RECOMMENDED(
        titleId = R.string.recommended_jobs,
    ),
    POPULAR(
        titleId = R.string.popular_jobs,
    )
}
