package com.abnormallydriven.daggerviewmodels.charlie

import android.content.Context
import android.content.Intent
import com.abnormallydriven.common.charlie.CharlieActivityIntentFactory
import dagger.Reusable
import javax.inject.Inject

@Reusable
class DefaultCharlieActivityIntentFactory @Inject constructor(): CharlieActivityIntentFactory {
    override fun createCharlieActivityIntent(context: Context): Intent {
        return Intent(context, CharlieActivity::class.java)
    }
}