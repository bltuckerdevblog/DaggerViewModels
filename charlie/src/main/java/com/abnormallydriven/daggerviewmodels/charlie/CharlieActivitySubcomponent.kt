package com.abnormallydriven.daggerviewmodels.charlie

import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = [CharlieActivityModule::class])
interface CharlieActivitySubcomponent : AndroidInjector<CharlieActivity> {

    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<CharlieActivity>() {}
}