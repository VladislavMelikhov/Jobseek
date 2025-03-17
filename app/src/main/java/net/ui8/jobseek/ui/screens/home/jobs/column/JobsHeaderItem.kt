package net.ui8.jobseek.ui.screens.home.jobs.column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import net.ui8.jobseek.R
import net.ui8.jobseek.ui.theme.JobseekTheme
import net.ui8.jobseek.ui.theme.Padding

@Composable
fun JobsHeaderItem(
    text: String,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = Padding.Large),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            modifier = Modifier
                .weight(1f),
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.onSurface,
            text = text,
        )
        Text(
            style = MaterialTheme.typography.titleSmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            text = stringResource(R.string.see_all),
        )
    }
}

@Composable
@Preview
private fun JobsHeaderItemPreview() {
    JobseekTheme(darkTheme = false) {
        Surface {
            JobsHeaderItem(
                text = stringResource(R.string.popular_jobs)
            )
        }
    }
}
