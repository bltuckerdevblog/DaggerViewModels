package com.abnormallydriven.daggerviewmodels

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log
import javax.inject.Inject

class MainActivityViewModel @Inject constructor() : ViewModel() {

    val messageLiveData: MutableLiveData<String> = MutableLiveData()

    init{
        Log.d("debug", "MainActivityViewModel.init()")
        messageLiveData.postValue("Main Activity Message")
    }

    override fun onCleared() {
        Log.d("debug", "MainActivityViewModel.onCleared()")
    }
}