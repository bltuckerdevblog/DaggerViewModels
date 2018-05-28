package com.abnormallydriven.daggerviewmodels

import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = [(MainActivityModule::class)])
interface MainActivitySubcomponent : AndroidInjector<MainActivity>{

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>() {}
}
