package com.example.jesuitasrioja4.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Centro Sagrado Corazón Logroño"
    }
    val text: LiveData<String> = _text
}