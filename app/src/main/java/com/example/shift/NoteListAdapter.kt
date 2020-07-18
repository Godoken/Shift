package com.example.shift

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class NoteListAdapter: RecyclerView.Adapter<NoteListAdapter.ViewHolder>() {

    private val noteList: MutableList<Note> = LinkedList()
    private var noteListener: NoteListener? = null

    fun setNoteList(newNotes: List<Note>) {
        noteList.clear()
        noteList.addAll(newNotes)

        notifyDataSetChanged()
    }

    fun setListener(listener: NoteListener) {
        noteListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cell_note, parent, false)
        return ViewHolder(view, noteListener)
    }

    override fun getItemCount(): Int {
        return noteList.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(model = noteList[position])
    }

    class ViewHolder(itemView: View, private val noteListener: NoteListener?) : RecyclerView.ViewHolder(itemView) {

        private val title: TextView = itemView.findViewById(R.id.titleNote)

        fun bind(model: Note) {
            title.text = model.title
            itemView.setOnClickListener {
                noteListener?.onClickNote(model)
            }
        }
    }

    interface NoteListener {
        fun onClickNote(model: Note)
    }
}