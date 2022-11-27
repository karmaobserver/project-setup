package com.aleksejmakaji.filefinder.presentation.utils

fun Any?.isNull(onNull: () -> Unit) {
    if (this == null) {
        onNull.invoke()
    }
}
