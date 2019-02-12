package com.treblig.designpattern

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val valueViewModel = MutableLiveData<Int>()

    fun setViewModel(value: Int) {
        this.valueViewModel.value = value
    }

    fun getViewModel(): LiveData<Int> {
        return valueViewModel
    }
}






