package com.example.testldmld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.lifecycle.LiveData
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    private val TAG: String? = MainActivity::class.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val model = ViewModelProvider(this).get(RandomGenerator::class.java)

        val observer = Observer<String> {
                v -> textView.text = v
        }

        model.liveData.observe(this, observer)

        button.setOnClickListener {
            model.createNumber()
            Log.i(TAG,"onClickListener")
        }
    }
}
