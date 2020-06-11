package com.example.testexerciserecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {

    companion object {
        private val TAG: String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM)
        supportActionBar?.setCustomView(R.layout.actionbar)

        btnClickMovies.setOnClickListener {
            val intent = Intent(this, MoviesListActivity::class.java)
            startActivity(intent)
            Log.i(TAG,"Clicking Show me the movies button")
        }
    }
}
