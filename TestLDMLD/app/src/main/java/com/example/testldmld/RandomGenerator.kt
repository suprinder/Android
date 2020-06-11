package com.example.testldmld

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RandomGenerator: ViewModel() {

     private val randomgenerator: MutableLiveData<String> by lazy { MutableLiveData<String>() }

     val liveData: LiveData<String> get() = randomgenerator

    companion object {
        private  val TAG: String? = RandomGenerator::class.simpleName
    }

    fun getNumber(): MutableLiveData<String>{
        if(randomgenerator == null){
            createNumber()
            Log.i(TAG, "Get Number")
        }
        return randomgenerator

    }
     fun createNumber(){

        val number = (1..6).random()
        randomgenerator.value = number.toString()
        Log.i(TAG,"Create a number")

    }

}