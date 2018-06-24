package com.abnormallydriven.daggerviewmodels

import com.abnormallydriven.common.alpha.AlphaActivityIntentFactory
import com.abnormallydriven.common.bravo.BravoActivityIntentFactory
import com.abnormallydriven.common.charlie.CharlieActivityIntentFactory
import com.abnormallydriven.daggerviewmodels.alpha.DefaultAlphaActivityIntentFactory
import com.abnormallydriven.daggerviewmodels.bravo.DefaultBravoActivityIntentFactory
import com.abnormallydriven.daggerviewmodels.charlie.DefaultCharlieActivityIntentFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ActivityFactoryModule {

    @Binds
    abstract fun bindAlphaActivityIntentFactory(defaultAlphaActivityIntentFactory: DefaultAlphaActivityIntentFactory): AlphaActivityIntentFactory

    @Binds
    abstract fun bindBravoActivityIntentFactory(defaultBravoActivityIntentFactory: DefaultBravoActivityIntentFactory) : BravoActivityIntentFactory

    @Binds
    abstract fun bindCharlieActivityIntentFactory(defaultCharlieActivityIntentFactory: DefaultCharlieActivityIntentFactory): CharlieActivityIntentFactory
}