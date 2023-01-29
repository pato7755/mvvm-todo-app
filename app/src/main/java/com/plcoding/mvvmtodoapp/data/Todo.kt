package com.plcoding.mvvmtodoapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todo")
data class Todo(
    val title: String,
    val description: String?,
    val isDone: Boolean,
    @PrimaryKey val id: Int?
)
