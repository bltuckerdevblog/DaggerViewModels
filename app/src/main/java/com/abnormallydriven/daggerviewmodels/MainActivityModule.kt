package com.abnormallydriven.daggerviewmodels

import android.arch.lifecycle.ViewModel
import com.abnormallydriven.common.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MainActivityModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainActivityViewModel::class)
    abstract fun bindProductsViewModel(mainActivityViewModel: MainActivityViewModel): ViewModel

}
