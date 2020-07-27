package com.example.shift.feature.note.list.data

import com.example.shift.feature.note.domain.entity.Note
import com.example.shift.feature.note.list.domain.NotesRepository

class NoteRepositoryImpl(
    private val networkNoteDataSource: NetworkNoteDataSource
) : NotesRepository {

    override fun getNotes(): List<Note> = networkNoteDataSource.getNotes()
}