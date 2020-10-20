package com.aman.helloworldkmm.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aman.helloworldkmm.shared.Greeting
import android.widget.TextView
import com.aman.helloworldkmm.shared.Platform

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = "${greet()}!"
    }
}
