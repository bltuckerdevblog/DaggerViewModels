package com.abnormallydriven.daggerviewmodels

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import javax.inject.Inject

class MainActivityViewModel @Inject constructor() : ViewModel() {

    val messageLiveData: MutableLiveData<String> = MutableLiveData()

    init{
        messageLiveData.postValue("Main Activity Message")
    }
}