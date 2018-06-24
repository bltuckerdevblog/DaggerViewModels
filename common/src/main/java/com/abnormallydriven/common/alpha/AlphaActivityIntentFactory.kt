package com.abnormallydriven.common.alpha

import android.content.Context
import android.content.Intent

interface AlphaActivityIntentFactory {

    fun createAlphaActivityIntent(context: Context): Intent

}