package com.abnormallydriven.daggerviewmodels

import com.abnormallydriven.common.alpha.AlphaActivityIntentFactory
import com.abnormallydriven.daggerviewmodels.alpha.DefaultAlphaActivityIntentFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ActivityFactoryModule {

    @Binds
    abstract fun bindAlphaActivityIntentFactory(defaultAlphaActivityIntentFactory: DefaultAlphaActivityIntentFactory): AlphaActivityIntentFactory

}