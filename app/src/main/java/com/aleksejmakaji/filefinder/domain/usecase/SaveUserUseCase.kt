package com.aleksejmakaji.filefinder.domain.usecase

import com.aleksejmakaji.filefinder.data.repository.model.UserModel
import com.aleksejmakaji.filefinder.data.wrapper.State
import com.aleksejmakaji.filefinder.domain.repository.UserRepositoryInterface

class SaveUserUseCase(
    private val userRepository: UserRepositoryInterface
) : UseCaseSuspend<UserModel, State<Long>>() {

    override suspend fun invoke(input: UserModel): State<Long> {
        return userRepository.save(input)
    }
}
