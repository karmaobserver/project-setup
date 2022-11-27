package com.aleksejmakaji.filefinder.presentation.common

import androidx.lifecycle.ViewModel

/**
 * Common logic for all ViewModels
 */
abstract class BaseViewModel : ViewModel() {
    companion object {
        const val FLOW_STOP_TIMEOUT_MILLISECONDS = 5000L
    }
}
