package com.example.view.phonekt.note

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface NoteDAO {
    @Insert(onConflict = REPLACE)
    fun insert(note : NoteEntity)

    @Query("SELECT * FROM note")
    fun getAll() : List<NoteEntity>

    @Delete
    fun delete(note: NoteEntity)
}