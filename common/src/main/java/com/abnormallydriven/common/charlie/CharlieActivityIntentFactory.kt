package com.abnormallydriven.common.charlie

import android.content.Context
import android.content.Intent

interface CharlieActivityIntentFactory {
    fun createCharlieActivityIntent(context: Context) : Intent
}