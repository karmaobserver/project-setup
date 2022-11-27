package com.aleksejmakaji.filefinder.domain.usecase

import com.aleksejmakaji.filefinder.data.repository.model.UserModel
import com.aleksejmakaji.filefinder.data.wrapper.State
import com.aleksejmakaji.filefinder.domain.repository.UserRepositoryInterface
import kotlinx.coroutines.flow.Flow

class GetUserUseCase(
    private val userRepository: UserRepositoryInterface
) : UseCase<Unit, Flow<State<UserModel?>>>() {
    override operator fun invoke(input: Unit): Flow<State<UserModel?>> {
        return userRepository.get()
    }
}
