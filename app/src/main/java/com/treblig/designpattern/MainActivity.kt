package com.treblig.designpattern

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainPresenter.View {

    lateinit var mainPresenter: MainPresenter
    lateinit var textView2: TextView;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainPresenter = MainPresenter(this)
        textView2 = findViewById<TextView>(R.id.textView2)
        button2.setOnClickListener {
            mainPresenter.incrementValue()
        }
    }


    override fun setTextView(value: Int) {
        textView2.setText(value.toString())
    }
}
