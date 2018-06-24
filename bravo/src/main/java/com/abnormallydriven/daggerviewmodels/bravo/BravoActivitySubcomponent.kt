package com.abnormallydriven.daggerviewmodels.bravo

import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = [BravoActivityModule::class])
interface BravoActivitySubcomponent : AndroidInjector<BravoActivity> {

    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<BravoActivity>(){}
}