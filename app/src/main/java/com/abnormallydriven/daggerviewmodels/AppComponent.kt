package com.abnormallydriven.daggerviewmodels

import com.abnormallydriven.common.ViewModelModule
import com.abnormallydriven.daggerviewmodels.alpha.AlphaActivityInjectionModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class,
    ViewModelModule::class,
    ActivityFactoryModule::class,
    MainActivityInjectionModule::class,
    AlphaActivityInjectionModule::class
])
interface AppComponent : AndroidInjector<DaggerViewModelApp> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<DaggerViewModelApp>() {}

}