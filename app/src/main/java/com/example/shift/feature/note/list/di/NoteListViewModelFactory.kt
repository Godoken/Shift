package com.example.shift.feature.note.list.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.shift.feature.note.list.data.NetworkNoteDataSource
import com.example.shift.feature.note.list.data.NetworkNoteDataSourceImpl
import com.example.shift.feature.note.list.data.NoteRepositoryImpl
import com.example.shift.feature.note.list.domain.GetNotesUseCase
import com.example.shift.feature.note.list.presentation.NoteListViewModel

class NoteListViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        if (modelClass == NoteListViewModel::class.java) {
            val networkDataSource = NetworkNoteDataSourceImpl()
            val noteRepository = NoteRepositoryImpl(networkDataSource)
            val getNoteUseCase = GetNotesUseCase(noteRepository)

            return NoteListViewModel(getNoteUseCase) as T
        } else {
            error("Unexpected class $modelClass")
        }
    }
}