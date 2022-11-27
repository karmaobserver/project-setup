package com.aleksejmakaji.filefinder.data.mapper

import com.aleksejmakaji.filefinder.data.repository.model.UserModel
import com.aleksejmakaji.filefinder.data.room.entity.UserEntity

class UserMapper : Mapper<UserEntity, UserModel> {

    /**
     * Map a [UserEntity] instance to a [UserModel] instance
     */
    override fun mapFromEntity(type: UserEntity): UserModel {
        return UserModel(
            type.firstName,
            type.lastName
        )
    }

    /**
     * Map a [UserModel] instance to a [UserEntity] instance
     */
    override fun mapToEntity(type: UserModel): UserEntity {
        return UserEntity(
            0,
            type.firstName,
            type.lastName
        )
    }
}
