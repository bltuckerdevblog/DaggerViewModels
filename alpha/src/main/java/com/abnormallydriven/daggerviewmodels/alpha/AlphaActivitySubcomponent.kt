package com.abnormallydriven.daggerviewmodels.alpha

import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = [AlphaActivityModule::class])
interface AlphaActivitySubcomponent: AndroidInjector<AlphaActivity> {

    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<AlphaActivity>() {}
}