package ru.tvoyhod.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val test = TextView(this).apply {
            text = "ТВОЙ ХОД\n\nANDROID NATIVE CORE OK"
            textSize = 26f
            setTextColor(Color.WHITE)
            setBackgroundColor(Color.rgb(5, 9, 11))
            gravity = Gravity.CENTER
        }

        setContentView(test)
    }
}
