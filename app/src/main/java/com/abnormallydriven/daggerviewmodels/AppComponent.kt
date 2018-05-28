package com.abnormallydriven.daggerviewmodels

import com.abnormallydriven.common.ViewModelModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [(AndroidInjectionModule::class),
    (ViewModelModule::class),
    (MainActivityInjectionModule::class)
])
interface AppComponent : AndroidInjector<DaggerViewModelApp> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<DaggerViewModelApp>() {}

}