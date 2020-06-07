package com.example.codelabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.core.text.isDigitsOnly
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)


        button.setOnClickListener {
            RollDice()
        }

    }

    private fun RollDice(){
        var random = (1..6).random()

        var random1 = (1..6).random()
        if ( random1 == random){
            random1 = (1..6).random()
        }
        dice_image.setImageResource(getRandomDiceImage(random))
        dice_image1.setImageResource(getRandomDiceImage(random1))

    }

    fun getRandomDiceImage (random: Int): Int {
        return when(random) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
}
