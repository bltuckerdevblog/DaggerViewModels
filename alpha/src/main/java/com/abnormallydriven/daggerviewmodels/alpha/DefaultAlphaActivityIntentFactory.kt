package com.abnormallydriven.daggerviewmodels.alpha

import android.content.Context
import android.content.Intent
import com.abnormallydriven.common.alpha.AlphaActivityIntentFactory
import dagger.Reusable
import javax.inject.Inject

@Reusable
class DefaultAlphaActivityIntentFactory @Inject constructor() : AlphaActivityIntentFactory {
    override fun createAlphaActivityIntent(context: Context): Intent {
        return Intent(context, AlphaActivity::class.java)
    }
}