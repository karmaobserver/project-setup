package com.aleksejmakaji.filefinder.data.repository.source

import com.aleksejmakaji.filefinder.data.error.DatabaseError
import com.aleksejmakaji.filefinder.data.mapper.UserMapper
import com.aleksejmakaji.filefinder.data.repository.model.UserModel
import com.aleksejmakaji.filefinder.data.room.dao.UserDao
import com.aleksejmakaji.filefinder.data.room.entity.UserEntity
import com.aleksejmakaji.filefinder.data.wrapper.ErrorState
import com.aleksejmakaji.filefinder.data.wrapper.State
import com.aleksejmakaji.filefinder.data.wrapper.SuccessState
import com.aleksejmakaji.filefinder.data.wrapper.suspendResultWithStateCatchingDatabaseError
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.mapNotNull

class UserLocalDataSource(
    private val userDao: UserDao,
    private val userMapper: UserMapper
) {
    suspend fun save(userModel: UserModel): State<Long> {
        return suspendResultWithStateCatchingDatabaseError {
            userDao.save(userMapper.mapToEntity(userModel))
        }
    }

    fun getUser(): Flow<State<UserModel?>> {
        return userDao.get().mapNotNull<UserEntity?, State<UserModel?>> {
            it?.let { SuccessState(userMapper.mapFromEntity(it)) } ?: SuccessState(null)
        }.catch {
            emit(ErrorState(DatabaseError(it)))
        }
    }
}
