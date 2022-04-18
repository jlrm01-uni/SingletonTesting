package com.example.singletontesting

object MySingleton {
    private val notes: MutableList<String> = mutableListOf()

    fun addNote(note: String) {
        notes.add(note)
    }

    override fun toString(): String {
        return notes.joinToString()
    }
}