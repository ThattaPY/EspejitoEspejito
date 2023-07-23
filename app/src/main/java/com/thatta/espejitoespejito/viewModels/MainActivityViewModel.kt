package com.thatta.espejitoespejito.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel() : ViewModel() {
    val apiKey: MutableLiveData<String> = MutableLiveData()

}