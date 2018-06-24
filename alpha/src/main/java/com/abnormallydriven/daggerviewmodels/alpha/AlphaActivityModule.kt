package com.abnormallydriven.daggerviewmodels.alpha

import android.arch.lifecycle.ViewModel
import com.abnormallydriven.common.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AlphaActivityModule {

    @Binds
    @IntoMap
    @ViewModelKey(AlphaActivityViewModel::class)
    abstract fun bindAlphaActivityViewModel(alphaActivityViewModel: AlphaActivityViewModel): ViewModel

}