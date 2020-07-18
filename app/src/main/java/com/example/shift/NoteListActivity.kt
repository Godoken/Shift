package com.example.shift

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_note_list.*

class NoteListActivity : AppCompatActivity() {

    private val noteList = listOf(
        "Научиться создавать приложения под Android",
        "Сходить в магазин",
        "Ответить на вопросы из чатика",
        "Открыть Америку",
        "Сдать сессию",
        "Вынести мусор",
        "Накормить кота",
        "Закоммитить изменения",
        "Подготовиться к докладу"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)

        val adapter = NoteListAdapter()
        val layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = layoutManager

        adapter.setNoteList(noteList)
    }
}