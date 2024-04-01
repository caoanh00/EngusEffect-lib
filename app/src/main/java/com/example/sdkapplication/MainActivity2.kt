package com.example.sdkapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.engus.sdk.EngusEffect

class MainActivity2 : AppCompatActivity() {

    private lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btn = findViewById(R.id.buttonView)
        btn.setOnClickListener {
            // use of blink-library
            EngusEffect.blink(btn)
        }
    }
}