package net.ui8.jobseek.utils.uiItem

import androidx.compose.runtime.Composable
import net.ui8.jobseek.utils.IdOwner

interface UiItem<Id : Any> : IdOwner<Id> {

    @Composable
    fun ItemContent()
}
