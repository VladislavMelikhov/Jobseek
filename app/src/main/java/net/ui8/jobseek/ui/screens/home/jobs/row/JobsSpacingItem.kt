package net.ui8.jobseek.ui.screens.home.jobs.row

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import net.ui8.jobseek.ui.theme.Dimensions
import net.ui8.jobseek.ui.theme.JobseekTheme

@Composable
fun JobsSpacingItem() {
    Spacer(
        modifier = Modifier
            .height(Dimensions.JobsRowItem.Height)
            .width(Dimensions.JobsRowItem.Spacing)
    )
}

@Composable
@Preview
private fun JobsSpacingItemPreview() {
    JobseekTheme(darkTheme = true) {
        JobsSpacingItem()
    }
}
