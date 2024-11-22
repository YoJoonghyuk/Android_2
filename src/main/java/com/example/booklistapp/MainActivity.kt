package com.example.booklistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val books = listOf(
            Book("Война и мир", R.drawable.book1),
            Book("Преступление и наказание", R.drawable.book2),
            Book("Мастер и Маргарита", R.drawable.book3),
            Book("Отцы и дети", R.drawable.book4),
            Book("Собачье сердце", R.drawable.book5),
            Book("Бедная Лиза", R.drawable.book6),
        )

        val adapter = BookAdapter(books)
        recyclerView.adapter = adapter
    }
}
