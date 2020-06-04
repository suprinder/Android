package com.example.testexercise_livedata

import android.util.Log
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class RandomGenerator: ViewModel(){

     private var randomNumber: MutableLiveData<String> = MutableLiveData<String>()

    fun getNumber(): MutableLiveData<String>{
        Log.i("suprinder","Get number")
        if(randomNumber == null){
            createNumber()
        }
            return randomNumber

    }

    fun createNumber() {
        Log.i("suprinder","Create number")
        val number = (1..10).random()
        randomNumber.value = "Number is : ${number}"

    }

    override fun onCleared() {
        super.onCleared()
        Log.i("suprinder", "ViewModel destroyed")
    }
}

