package com.aleksejmakaji.filefinder.di

import com.aleksejmakaji.filefinder.domain.usecase.GetUserUseCase
import com.aleksejmakaji.filefinder.domain.usecase.SaveUserUseCase
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val domainKoinModule = module {
    factoryOf(::GetUserUseCase)
    factoryOf(::SaveUserUseCase)
}
