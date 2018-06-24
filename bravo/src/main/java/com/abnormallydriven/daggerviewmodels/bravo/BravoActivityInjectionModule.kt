package com.abnormallydriven.daggerviewmodels.bravo

import android.app.Activity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

@Module(subcomponents = [BravoActivitySubcomponent::class])
abstract class BravoActivityInjectionModule {

    @Binds
    @IntoMap
    @ActivityKey(BravoActivity::class)
    abstract fun bindBravoActivityInjectorFactyory(builder: BravoActivitySubcomponent.Builder) :
            AndroidInjector.Factory<out Activity>
}