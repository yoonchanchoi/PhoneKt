package com.example.view.phonekt.note

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note")
data class NoteEntity(
    @PrimaryKey(autoGenerate = true)
    var id : Long?,
    val title: String = "",
    val content: String = "",
    val day: String = "")