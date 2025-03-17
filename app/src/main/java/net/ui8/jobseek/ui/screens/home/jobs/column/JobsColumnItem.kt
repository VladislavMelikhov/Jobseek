package net.ui8.jobseek.ui.screens.home.jobs.column

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import net.ui8.jobseek.data.jobs.models.Job
import net.ui8.jobseek.data.jobs.sample.SampleJobs
import net.ui8.jobseek.ui.theme.Dimensions
import net.ui8.jobseek.ui.theme.JobseekTheme
import net.ui8.jobseek.ui.theme.Padding

@Composable
fun JobsColumnItem(
    job: Job,
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = Padding.Medium),
        color = MaterialTheme.colorScheme.surfaceContainer,
        shape = MaterialTheme.shapes.medium
    ) {
        Row(
            Modifier
                .padding(Padding.Medium)
        ) {
            val company = job.company
            Image(
                modifier = Modifier
                    .size(Dimensions.CompanyLogoSize.Medium),
                painter = painterResource(company.logo),
                contentDescription = company.name,
            )
            Spacer(
                modifier = Modifier
                    .width(Padding.Medium)
            )
            Column {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        modifier = Modifier
                            .weight(1f)
                            .padding(end = Padding.Medium),
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.onSurface,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        text = job.title
                    )
                    Text(
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onSurface,
                        text = job.salary.toDisplayString(),
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        modifier = Modifier
                            .weight(1f)
                            .padding(end = Padding.Medium),
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        text = company.name,
                    )
                    Text(
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        text = job.location.toDisplayString(),
                    )
                }
            }
        }
    }

}

@Composable
@Preview
fun JobsColumnItemPreview() {
    JobseekTheme(darkTheme = true) {
        val job = SampleJobs.JrExecutiveBurgerKing
        val company = job.company
        JobsColumnItem(
            job = job
                .copy(
                    title = job.title + " some long long long long text",
                    company = company
                        .copy(
                            name = company.name + " some long long long text"
                        )
                ),
        )
    }
}
