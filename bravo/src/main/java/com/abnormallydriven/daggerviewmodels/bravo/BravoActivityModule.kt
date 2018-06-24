package com.abnormallydriven.daggerviewmodels.bravo

import android.arch.lifecycle.ViewModel
import com.abnormallydriven.common.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class BravoActivityModule {

    @Binds
    @IntoMap
    @ViewModelKey(BravoActivityViewModel::class)
    abstract fun bindBravoActivityViewModel(bravoActivityViewModel: BravoActivityViewModel): ViewModel
}