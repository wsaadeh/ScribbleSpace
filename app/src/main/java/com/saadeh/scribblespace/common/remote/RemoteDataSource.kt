package com.saadeh.scribblespace.common.remote

import com.saadeh.scribblespace.common.model.NoteData

private const val NOTE_COLLECTION = "notes"

class RemoteDataSource private constructor(

) {

    suspend fun addNote(title: String, description: String): Result<String> {
      return TODO()
    }

    suspend fun getNotes(): Result<List<NoteData>> {
       return TODO()
    }

    suspend fun deleteNote(id: String): Result<Unit> {
      return TODO()
    }

    companion object {
        fun create(): RemoteDataSource {
            return RemoteDataSource()
        }
    }
}