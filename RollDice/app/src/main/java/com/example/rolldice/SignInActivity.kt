package com.example.rolldice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        // Find Views
        val emailButton: Button = findViewById(R.id.emailButton)
        val skipText: TextView = findViewById(R.id.skipText)

        // Email button click
        emailButton.setOnClickListener {
            // Redirect to email sign-in or registration screen
            // startActivity(Intent(this, EmailSignInActivity::class.java))
        }

        // Skip button click
        skipText.setOnClickListener {
            // Skip sign-in and proceed
            finish()
        }
    }
}
