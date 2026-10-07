package com.example.noteapp.util

import androidx.room.TypeConverter
import java.util.Date

class DataConverter {
    @TypeConverter
    fun timeStampFromData(data: Date?): Long? {
        return data?.time
    }

    @TypeConverter
    fun dateFromTimeStamp(timeStamp: Long?): Date? {
        return timeStamp?.let { Date(it) }
    }
}
