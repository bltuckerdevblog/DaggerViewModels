package com.abnormallydriven.daggerviewmodels.charlie

import android.arch.lifecycle.ViewModel
import com.abnormallydriven.common.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class CharlieActivityModule {
    @Binds
    @IntoMap
    @ViewModelKey(CharlieActivityViewModel::class)
    abstract fun bindCharlieActivityViewModel(charlieActivityViewModel: CharlieActivityViewModel) : ViewModel
}