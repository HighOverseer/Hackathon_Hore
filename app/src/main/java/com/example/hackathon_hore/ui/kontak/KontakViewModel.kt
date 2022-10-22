package com.example.hackathon_hore.ui.kontak

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class KontakViewModel : ViewModel(){

    private val _text = MutableLiveData<String>().apply {
        value = "This is kontak Fragment"
    }
    val text: LiveData<String> = _text
}