package com.abnormallydriven.common.bravo

import android.content.Context
import android.content.Intent

interface BravoActivityIntentFactory {
    fun createBravoActivityIntent(context: Context): Intent
}