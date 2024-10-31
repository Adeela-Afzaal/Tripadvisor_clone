package com.example.tripadvisor

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val skipText = findViewById<TextView>(R.id.skipText)
        skipText.setOnClickListener {
            // Navigate to Location Permission Activity
            val intent = Intent(this, LocationPermissionActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
