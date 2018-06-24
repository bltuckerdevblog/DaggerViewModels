package com.abnormallydriven.daggerviewmodels.alpha

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.abnormallydriven.common.ViewModelFactory
import dagger.android.AndroidInjection
import javax.inject.Inject

class AlphaActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private lateinit var viewModel: AlphaActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        Log.d("debug", "AlphaActivity.onCreate()")
        setContentView(R.layout.activity_alpha)

        viewModel = ViewModelProviders.of(this, viewModelFactory).get(AlphaActivityViewModel::class.java)

        val messageTextView = findViewById<TextView>(R.id.message_text_view)

        viewModel.messageLiveData.observe(this, Observer<String>{
            messageTextView.text = it
        })
    }

    override fun onStop() {
        super.onStop()
        Log.d("debug", "AlphaActivity.onStop()")
    }

    override fun onDestroy() {
        Log.d("debug", "before super.onDestroy() in AlphaActivity.onDestroy()")
        super.onDestroy()
        Log.d("debug", "AlphaActivity.onDestroy()")
    }
}
