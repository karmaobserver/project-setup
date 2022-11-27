package com.aleksejmakaji.filefinder.di

import com.aleksejmakaji.filefinder.presentation.viewmodel.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val presentationKoinModule = module {
    viewModelOf(::UserViewModel)
}
