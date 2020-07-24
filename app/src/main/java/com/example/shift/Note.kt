package com.example.shift

import java.io.Serializable

data class Note (val title: String,
            val description: String? = null): Serializable