package com.treblig.designpattern


class MainPresenter(private val view: View) {
    private var value = 1

    fun incrementValue() {
        view.setTextView(++value)
    }

    interface View {
        fun setTextView(value: Int)
    }

}






