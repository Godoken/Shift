package com.example.shift.feature.note.list.domain

import com.example.shift.feature.note.domain.entity.Note

interface NotesRepository {

    fun getNotes() : List<Note>
}