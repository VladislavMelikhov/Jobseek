package net.ui8.jobseek.data.jobs.models

import androidx.annotation.DrawableRes

data class Company(
    val id: Long,
    val name: String,
    @DrawableRes
    val logo: Int,
)
