package net.ui8.jobseek.data.jobs.sample

import net.ui8.jobseek.data.jobs.models.JobLocation

object SampleLocations {

    val LosAngels: JobLocation =
        JobLocation(
            country = "US",
            province = null,
            city = "Los Angels",
        )

    val Florida: JobLocation =
        JobLocation(
            country = "US",
            province = "Florida",
            city = null,
        )
}
