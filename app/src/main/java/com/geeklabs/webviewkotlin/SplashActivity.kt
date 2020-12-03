package com.geeklabs.webviewkotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        withDelay(2000) {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}