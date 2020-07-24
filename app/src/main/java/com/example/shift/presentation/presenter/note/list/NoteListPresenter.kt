package com.example.shift.presentation.presenter.note.list

import com.example.shift.model.entity.Note
import com.example.shift.presentation.presenter.BasePresenter
import com.example.shift.presentation.ui.note.list.NoteListView

class NoteListPresenter : BasePresenter<NoteListView>() {

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

    override fun onViewAttached() {
        view?.setNoteList(noteList)
    }

    fun onNoteClicked(note: Note) {
        view?.showNoteDetails(note)
    }
}