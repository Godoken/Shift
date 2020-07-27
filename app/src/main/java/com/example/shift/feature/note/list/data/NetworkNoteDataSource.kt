package com.example.shift.feature.note.list.data

import com.example.shift.feature.note.domain.entity.Note

interface NetworkNoteDataSource {

    fun getNotes(): List<Note>
}

class NetworkNoteDataSourceImpl : NetworkNoteDataSource {

    override fun getNotes(): List<Note> =
        listOf(
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
}