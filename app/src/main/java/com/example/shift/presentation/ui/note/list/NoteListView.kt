package com.example.shift.presentation.ui.note.list

import com.example.shift.model.entity.Note
import com.example.shift.presentation.ui.ViewContract

interface NoteListView : ViewContract {

    fun setNoteList(note: List<Note>)

    fun showNoteDetails(note: Note)
}