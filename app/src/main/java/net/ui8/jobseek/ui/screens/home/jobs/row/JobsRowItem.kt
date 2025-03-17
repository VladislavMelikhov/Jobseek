package net.ui8.jobseek.ui.screens.home.jobs.row

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import net.ui8.jobseek.data.jobs.models.Job
import net.ui8.jobseek.data.jobs.sample.SampleJobs
import net.ui8.jobseek.ui.theme.Dimensions
import net.ui8.jobseek.ui.theme.JobseekTheme
import net.ui8.jobseek.ui.theme.Padding

@Composable
fun JobsRowItem(
    job: Job,
) {
    Row {
        Surface(
            modifier = Modifier
                .height(Dimensions.JobsRowItem.Height)
                .aspectRatio(1f),
            color = MaterialTheme.colorScheme.surfaceContainer,
            shape = MaterialTheme.shapes.medium,
        ) {
            val company = job.company
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = Padding.Medium),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Image(
                    modifier = Modifier
                        .size(Dimensions.CompanyLogoSize.Medium),
                    painter = painterResource(company.logo),
                    contentDescription = company.name,
                )
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = Padding.Small),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.onSurface,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    text = job.title,
                )
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = Padding.Small),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.titleSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    text = company.name,
                )
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = Padding.Small),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.titleSmall,
                    color = MaterialTheme.colorScheme.onSurface,
                    text = job.salary.toDisplayString(),
                )
            }
        }
        Spacer(
            modifier = Modifier
                .height(Dimensions.JobsRowItem.Height)
                .width(Dimensions.JobsRowItem.Spacing)
        )
    }
}

@Composable
@Preview
private fun JobsRowItemPreview() {
    JobseekTheme(darkTheme = true) {
        val job = SampleJobs.SrDeveloperSpotify
        JobsRowItem(
            job = job
        )
    }
}
