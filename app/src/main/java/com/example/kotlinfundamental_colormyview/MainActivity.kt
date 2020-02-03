package com.example.kotlinfundamental_colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun makeColored(view: View) {
        // When user tap the UI item, the color of UI item will be changed.
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            R.id.button_red -> box_four_text.setBackgroundResource(R.color.my_red)
            R.id.button_yellow -> box_three_text.setBackgroundResource(R.color.my_yellow)
            R.id.button_green -> box_five_text.setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun makeResource(view: View) {
        // When user tap the UI item, the color of UI item will be changed.
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundResource(R.drawable.ic_android_black)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.ic_android_blue)
            R.id.box_three_text -> view.setBackgroundResource(R.drawable.ic_android_green)
            R.id.box_four_text -> view.setBackgroundResource(R.drawable.ic_android_purple)
            R.id.box_five_text -> view.setBackgroundResource(R.drawable.ic_android_red)
        }
    }

    private fun setListeners() {
        val boxOneText: TextView = findViewById(R.id.box_one_text)
        val boxTwoText: TextView = findViewById(R.id.box_two_text)
        val boxThreeText: TextView = findViewById(R.id.box_three_text)
        val boxFourText: TextView = findViewById(R.id.box_four_text)
        val boxFiveText: TextView = findViewById(R.id.box_five_text)

        val rootConstraintLayout: ConstraintLayout = findViewById(R.id.constraint_layout)

        val redButton: TextView = findViewById(R.id.button_red)
        val greenButton: TextView = findViewById(R.id.button_green)
        val yellowButton: TextView = findViewById(R.id.button_yellow)

        val clickableViews: List<View> =
            listOf(
                boxOneText,
                boxTwoText,
                boxThreeText,
                boxFourText,
                boxFiveText,
                rootConstraintLayout,
                redButton,
                greenButton,
                yellowButton
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }

//        for (item in clickableViews) {
//            item.setOnClickListener { makeResource(it) }
//        }
    }
}
