package com.abnormallydriven.daggerviewmodels.alpha

import android.app.Activity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

@Module(subcomponents = [AlphaActivitySubcomponent::class])
abstract class AlphaActivityInjectionModule {

    @Binds
    @IntoMap
    @ActivityKey(AlphaActivity::class)
    abstract fun bindAlphaActivityInjectorFactory(builder: AlphaActivitySubcomponent.Builder)
            : AndroidInjector.Factory<out Activity>
}