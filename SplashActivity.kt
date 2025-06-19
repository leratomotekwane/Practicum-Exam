package com.soundcity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val btnEnter = findViewById<Button>(R.id.btnEnter)
        val btnExit = findViewById<Button>(R.id.btnExit)

        btnEnter.setOnClickListener {
            // Navigate to MainActivity
            startActivity(Intent(this, MainActivity::class.java))
        }

        btnExit.setOnClickListener {
            // Exit the app
            finish()
        }
    }
}
