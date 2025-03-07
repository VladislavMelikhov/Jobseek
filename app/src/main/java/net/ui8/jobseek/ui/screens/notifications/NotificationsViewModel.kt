package net.ui8.jobseek.ui.screens.notifications

import android.util.Log
import androidx.lifecycle.ViewModel
import net.ui8.jobseek.utils.Tags

class NotificationsViewModel : ViewModel() {

    init {
        Log.d(Tags.VM_LIFECYCLE, "NotificationsViewModel init")
    }

    fun doSomething() {

    }

    override fun onCleared() {
        super.onCleared()
        Log.d(Tags.VM_LIFECYCLE, "NotificationsViewModel onCleared")
    }
}
