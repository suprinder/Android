package com.example.testexercise_livedata

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val model = ViewModelProvider(this).get(RandomGenerator::class.java)
        var randomNumber: LiveData<String> = model.getNumber()

        randomNumber.observe(this, Observer { s -> textView.text = s })

        button.setOnClickListener {
            model.createNumber()
            Log.i("suprinder", "Random Number Set")

        }
    }
}
