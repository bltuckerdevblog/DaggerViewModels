package com.abnormallydriven.daggerviewmodels

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class DaggerViewModelApp : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}