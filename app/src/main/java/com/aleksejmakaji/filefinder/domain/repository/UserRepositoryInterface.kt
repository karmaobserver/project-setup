package com.aleksejmakaji.filefinder.domain.repository

import com.aleksejmakaji.filefinder.data.repository.model.UserModel
import com.aleksejmakaji.filefinder.data.wrapper.State
import kotlinx.coroutines.flow.Flow

interface UserRepositoryInterface {
    fun get(): Flow<State<UserModel?>>
    suspend fun save(userModel: UserModel): State<Long>
}
