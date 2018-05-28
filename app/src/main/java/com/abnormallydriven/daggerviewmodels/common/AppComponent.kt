package com.abnormallydriven.daggerviewmodels.common

import com.abnormallydriven.daggerviewmodels.DaggerViewModelApp
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [(AndroidInjectionModule::class),
    (ViewModelModule::class)])
interface AppComponent : AndroidInjector<DaggerViewModelApp> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<DaggerViewModelApp>() {}

}