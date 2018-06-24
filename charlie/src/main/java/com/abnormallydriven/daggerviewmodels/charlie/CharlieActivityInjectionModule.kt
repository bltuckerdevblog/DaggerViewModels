package com.abnormallydriven.daggerviewmodels.charlie

import android.app.Activity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

@Module(subcomponents = [CharlieActivitySubcomponent::class])
abstract class CharlieActivityInjectionModule {

    @Binds
    @IntoMap
    @ActivityKey(CharlieActivity::class)
    abstract fun bindCharlieActivityInjectorFactory(builder: CharlieActivitySubcomponent.Builder): AndroidInjector.Factory<out Activity>
}