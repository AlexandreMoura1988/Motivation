package com.example.motivation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// splashActivity é o primeiro screen que o utilizador ira ver
class SplahActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splah)

        //retirar a actionBar
        if(supportActionBar != null) {
            supportActionBar!!.hide()
        }
    }
}