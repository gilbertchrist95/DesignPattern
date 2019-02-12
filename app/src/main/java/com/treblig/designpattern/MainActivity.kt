package com.treblig.designpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        viewModel.getViewModel().observe(this, Observer {
            textView3.text = it.toString()
        })

        button3.setOnClickListener {
            val x = textView3.text.toString().toInt() + 1
            viewModel.setViewModel(x)
        }

    }
}
