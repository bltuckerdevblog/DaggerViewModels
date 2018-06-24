package com.abnormallydriven.daggerviewmodels.bravo

import android.content.Context
import android.content.Intent
import com.abnormallydriven.common.bravo.BravoActivityIntentFactory
import dagger.Reusable
import javax.inject.Inject

@Reusable
class DefaultBravoActivityIntentFactory @Inject constructor(): BravoActivityIntentFactory {
    override fun createBravoActivityIntent(context: Context): Intent {
        return Intent(context, BravoActivity::class.java)
    }
}