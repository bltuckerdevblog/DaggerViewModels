package com.abnormallydriven.daggerviewmodels

import com.abnormallydriven.daggerviewmodels.common.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class DaggerViewModelApp : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }
}

/*
  @Override
  protected AndroidInjector<SimpleApplication> applicationInjector() {
    return DaggerSimpleApplication_Component.builder().create(this);
  }
 */