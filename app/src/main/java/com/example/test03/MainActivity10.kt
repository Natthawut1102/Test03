package com.example.test03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test03.EXTRA_MESSAGE
import com.example.test03.R
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)
        var message = intent.getStringExtra(EXTRA_MESSAGE)
        dp.text = message?:""
        back.setOnClickListener {
            val intent = Intent(this, MainActivity8::class.java)
            startActivity(intent)
        }
    }
}