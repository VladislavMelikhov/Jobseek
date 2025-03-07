package net.ui8.jobseek.ui.screens.home

import android.util.Log
import androidx.lifecycle.ViewModel
import net.ui8.jobseek.utils.Tags

class HomeViewModel : ViewModel() {

    init {
        Log.d(Tags.VM_LIFECYCLE, "HomeViewModel init")
    }

    fun doSomething() {

    }

    override fun onCleared() {
        super.onCleared()
        Log.d(Tags.VM_LIFECYCLE, "HomeViewModel onCleared")
    }
}
