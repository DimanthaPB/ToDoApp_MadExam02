package com.example.labexam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OnboardingActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding2)

        val nextBtn = findViewById<Button>(R.id.nextbtn)
        nextBtn.setOnClickListener {
            val Intent = Intent(this, OnboardingActivity3::class.java)
            startActivity(Intent)
        }

        val skipBtn = findViewById<Button>(R.id.skipbtn)
        skipBtn.setOnClickListener {
            val Intent = Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }


        //val backBtn = findViewById<Button>(R.id.backbtn)
        //backBtn.setOnClickListener {
        //    val Intent = Intent(this, OnboardingActivity1::class.java)
        //    startActivity(Intent)
        //}

    }
}