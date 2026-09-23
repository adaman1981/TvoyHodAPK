package ru.tvoyhod.app

import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val test = TextView(this).apply {
            text = "ТВОЙ ХОД\n\nANDROID CORE OK"
            textSize = 26f
            setTextColor(Color.WHITE)
            setBackgroundColor(Color.rgb(5, 9, 11))
            gravity = Gravity.CENTER
        }

        setContentView(test)
    }
}
