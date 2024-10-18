package com.example.rolldice

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class LocationPermissionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location_permission)

        // Find Views
        val allowLocationButton: Button = findViewById(R.id.allowLocationButton)
        val notNowText: TextView = findViewById(R.id.notNowText)

        // Button to proceed after allowing location
        allowLocationButton.setOnClickListener {
            // Proceed to the next activity or request location permission
            startActivity(Intent(this, SignInActivity::class.java)) // Adjust the intent based on your flow
        }

        // Not now button click
        notNowText.setOnClickListener {
            // Optionally handle skipping location permission
            // Redirect to another activity or just finish
            finish()
        }
    }
}
