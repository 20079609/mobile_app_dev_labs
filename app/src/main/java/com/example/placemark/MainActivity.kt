package com.example.placemark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        greetingButton.setOnClickListener {
            val greetingText = getString(R.string.greeting_text)
            Toast.makeText(this, greetingText, Toast.LENGTH_LONG).show()

            clickmeButton.setOnClickListener {
                val clickText = getString(R.string.click_text)
                Toast.makeText(this, clickText, Toast.LENGTH_LONG).show()
            }
        }
    }
}
