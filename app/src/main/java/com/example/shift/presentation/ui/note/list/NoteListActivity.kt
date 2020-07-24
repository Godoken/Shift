package com.example.shift.presentation.ui.note.list

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shift.R
import com.example.shift.model.entity.Note
import com.example.shift.presentation.presenter.note.list.NoteListPresenter
import com.example.shift.presentation.ui.note.NoteDetailActivity
import kotlinx.android.synthetic.main.activity_note_list.*

class NoteListActivity : AppCompatActivity(), NoteListView {

    val presenter = NoteListPresenter()
    val adapter = NoteListAdapter { note -> presenter.onNoteClicked(note) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)
        presenter.attachView(this)

        val layoutManager =
            LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = layoutManager
    }

    override fun setNoteList(note: List<Note>) {
        adapter.setNoteList(note)
    }

    override fun showNoteDetails(note: Note) {
        val intent = Intent(this@NoteListActivity, NoteDetailActivity::class.java)
        intent.putExtra("Note", note)
        startActivity(intent)
    }

    override fun onDestroy() {
        presenter.detachView()
        super.onDestroy()
    }
}