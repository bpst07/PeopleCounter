package com.arrow.peoplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var _timesClicked = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // set on-click listener
        btnClickMe.setOnClickListener {
            textViewCount.text = _timesClicked.toString()
            _timesClicked++
        }

    }
}