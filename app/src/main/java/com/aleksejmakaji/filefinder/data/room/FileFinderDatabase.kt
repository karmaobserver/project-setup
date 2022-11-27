package com.aleksejmakaji.filefinder.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aleksejmakaji.filefinder.data.room.dao.UserDao
import com.aleksejmakaji.filefinder.data.room.entity.UserEntity

@Database(
    entities = [
        UserEntity::class
    ],
    version = 1,
    exportSchema = false,
)
abstract class FileFinderDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}
