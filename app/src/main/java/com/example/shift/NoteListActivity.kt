package com.example.shift

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_note_list.*

class NoteListActivity : AppCompatActivity() {

    private val noteList = listOf(
        Note("Научиться создавать приложения под Android", "Описание 1"),
        Note("Сходить в магазин", "Описание 2"),
        Note("Ответить на вопросы из чатика", "Описание 3"),
        Note("Открыть Америку", "Описание 4"),
        Note("Сдать сессию", "Описание 5"),
        Note("Вынести мусор", "Описание 6"),
        Note("Накормить кота", "Описание 7"),
        Note("Закоммитить изменения", "Описание 8"),
        Note("Подготовиться к докладу", "Описание 9")
    )

    val adapter = NoteListAdapter { note ->
        val intent = Intent(this@NoteListActivity, NoteDetailActivity::class.java)
        intent.putExtra("Note", note)
        startActivity(intent)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)

        val layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = layoutManager

        adapter.setNoteList(noteList)
    }
}