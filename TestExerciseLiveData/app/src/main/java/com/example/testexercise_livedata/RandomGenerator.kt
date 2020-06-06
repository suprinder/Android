package com.example.testexercise_livedata

import android.util.Log
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class RandomGeneratorModel: ViewModel(){

    companion object {
        private val TAG: String? = RandomGeneratorModel::class.simpleName
    }

      val randomNumber: MutableLiveData<String> by lazy  {
          MutableLiveData<String>()
      }

    fun getNumber(): MutableLiveData<String>{
        Log.i(TAG,"Get number")
        if(randomNumber == null){
            createNumber()
        }
            return randomNumber

    }

    fun createNumber() {
        Log.i(TAG,"Create number")
        val number = (1..10).random()
        randomNumber.value = "Number is : ${number}"

    }

    override fun onCleared() {
        super.onCleared()
        Log.i(TAG, "ViewModel destroyed")
    }
}

