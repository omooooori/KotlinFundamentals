package com.example.kotlinfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class DiceRollerActivity : AppCompatActivity() {

    // When we want to declare the views in global space, we have to use nullable variable or lateinit
    // val diceImage: ImageView? = findViewById(R.id.image_view_result)
    lateinit var diceImage1: ImageView
    lateinit var diceImage2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dice_roller_activity)

        val buttonRoll: Button = findViewById(R.id.button_roll)
        buttonRoll.setOnClickListener { rollDice() }

    }

    private fun rollDice() {

        // declare here
        // val diceImage: ImageView = findViewById(R.id.image_view_result)

        diceImage1 = findViewById(R.id.image_view_result1)
        diceImage2 = findViewById(R.id.image_view_result2)

        diceImage1.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
    }

    private fun getRandomDiceImage(): Int {
        val randomInt: Int = (1..6).random()
        val diceResource = when(randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        return diceResource
    }
}
