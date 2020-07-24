package com.example.shift.presentation.viewmodel.note.list

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shift.model.entity.Note
import com.example.shift.presentation.viewmodel.SingleLiveEvent

class NoteListViewModel(private val a: String) : ViewModel() {

    private val noteList = listOf(
        Note(
            "Научиться создавать приложения под Android",
            "Описание 1"
        ),
        Note("Сходить в магазин", "Описание 2"),
        Note(
            "Ответить на вопросы из чатика",
            "Описание 3"
        ),
        Note("Открыть Америку", "Описание 4"),
        Note("Сдать сессию", "Описание 5"),
        Note("Вынести мусор", "Описание 6"),
        Note("Накормить кота", "Описание 7"),
        Note(
            "Закоммитить изменения",
            "Описание 8"
        ),
        Note(
            "Подготовиться к докладу",
            "Описание 9"
        )
    )

    val notes = MutableLiveData<List<Note>>()
    val noteClickedEvent = SingleLiveEvent<Note>()

    init {
        notes.value = noteList
    }

    fun noteClicked(note: Note) {
        noteClickedEvent(note)
    }
}