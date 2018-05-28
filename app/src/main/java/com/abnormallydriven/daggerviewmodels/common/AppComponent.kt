package com.abnormallydriven.daggerviewmodels.common

import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [(AndroidInjectionModule::class)])
interface AppComponent {
}