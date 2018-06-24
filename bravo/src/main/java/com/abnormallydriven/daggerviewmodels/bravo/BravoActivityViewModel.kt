package com.abnormallydriven.daggerviewmodels.bravo

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log
import javax.inject.Inject

class BravoActivityViewModel @Inject constructor() : ViewModel(){

    val messageLiveData: MutableLiveData<String> = MutableLiveData()

    init{
        Log.d("debug", "BravoActivityViewModel.init()")
        messageLiveData.postValue("BravoActivity Message")
    }

    override fun onCleared() {
        Log.d("debug", "BravoActivityViewModel.onCleared()")
    }
}
