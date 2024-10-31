package com.example.tripadvisor

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)

        // Delay for 3 seconds before transitioning to the SignUp Activity
        Handler().postDelayed({
            startActivity(Intent(this@SplashActivity, SignUpActivity::class.java))
            finish() // Finish the splash activity so it's removed from the back stack
        }, 3000) // 3000 milliseconds (3 seconds)
    }
}
