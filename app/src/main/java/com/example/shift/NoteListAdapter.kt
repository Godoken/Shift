package com.example.shift

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class NoteListAdapter: RecyclerView.Adapter<NoteListAdapter.ViewHolder>() {

    private val noteList: MutableList<String> = LinkedList()

    fun setNoteList(newNotes: List<String>) {
        noteList.clear()
        noteList.addAll(newNotes)

        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cell_note, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return noteList.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(model = noteList[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val title: TextView = itemView.findViewById(R.id.titleNote)

        fun bind(model: String) {
            title.text = model
        }
    }
}