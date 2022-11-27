package com.aleksejmakaji.filefinder.data.repository

import com.aleksejmakaji.filefinder.data.repository.model.UserModel
import com.aleksejmakaji.filefinder.data.repository.source.UserLocalDataSource
import com.aleksejmakaji.filefinder.data.wrapper.State
import com.aleksejmakaji.filefinder.domain.repository.UserRepositoryInterface
import kotlinx.coroutines.flow.Flow

class UserRepository(private val userLocalDataSource: UserLocalDataSource) :
    UserRepositoryInterface {

    override fun get(): Flow<State<UserModel?>> = userLocalDataSource.getUser()

    override suspend fun save(userModel: UserModel): State<Long> =
        userLocalDataSource.save(userModel)
}
