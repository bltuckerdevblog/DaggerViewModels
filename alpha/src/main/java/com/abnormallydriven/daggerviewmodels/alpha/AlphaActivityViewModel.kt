package com.abnormallydriven.daggerviewmodels.alpha

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log
import javax.inject.Inject

class AlphaActivityViewModel @Inject constructor() : ViewModel() {

    val messageLiveData: MutableLiveData<String> = MutableLiveData()

    init {
        Log.d("debug", "AlphaActivityViewModel.init")
        messageLiveData.postValue("Alpha Activity Message")
    }

    override fun onCleared() {
        Log.d("debug", "AlphaActivityViewModel.onCleared()")
    }
}