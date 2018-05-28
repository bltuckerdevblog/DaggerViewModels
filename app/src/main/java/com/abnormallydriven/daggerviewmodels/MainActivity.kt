package com.abnormallydriven.daggerviewmodels

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.abnormallydriven.common.ViewModelFactory
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        Log.d("debug", "MainActivity.onCreate()")
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MainActivityViewModel::class.java)

        val messageTextView = findViewById<TextView>(R.id.message_text_view)

        viewModel.messageLiveData.observe(this, Observer<String>{
            messageTextView.text = it
        })

        findViewById<Button>(R.id.alpha_button).setOnClickListener { v ->
            Log.d("debug", "alpha button click")
        }

        findViewById<Button>(R.id.bravo_button).setOnClickListener { v ->
            Log.d("debug", "bravo button click")
        }

        findViewById<Button>(R.id.charlie_button).setOnClickListener { v ->
            Log.d("debug", "charlie button click")
        }
    }

    override fun onStop() {
        super.onStop()
        Log.d("debug", "MainActivity.onStop()")
    }

    override fun onDestroy() {
        Log.d("debug", "before super.onDestroy() in MainActivity.onDestroy()")
        super.onDestroy()
        Log.d("debug", "MainActivity.onDestroy()")
    }
}
