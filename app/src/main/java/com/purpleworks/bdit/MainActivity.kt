package com.purpleworks.bdit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text_one.text = "I am master"

        button.setOnClickListener {
            imagePopup.visibility = View.VISIBLE
        }
    }
}
