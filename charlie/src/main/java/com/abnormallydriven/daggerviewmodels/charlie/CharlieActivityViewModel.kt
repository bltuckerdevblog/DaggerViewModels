package com.abnormallydriven.daggerviewmodels.charlie

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log
import javax.inject.Inject

class CharlieActivityViewModel @Inject constructor() : ViewModel() {

    val messageLiveData: MutableLiveData<String> = MutableLiveData()

    init{
        Log.d("debug", "CharlieActivityViewModel.init()")
        messageLiveData.postValue("CharlieActivity Message")
    }

    override fun onCleared() {
        Log.d("debug", "CharlieActivityViewModel.onCleared()")
    }
}