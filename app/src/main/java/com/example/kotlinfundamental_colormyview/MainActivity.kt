package com.example.kotlinfundamental_colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.TextValueSanitizer
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    lateinit var checkBox: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val status = arrayOf(
            "Color",
            "Image")

        checkBox = findViewById(R.id.checkbox)

        checkBox.isChecked = false
        checkBox.text = status[0]

        checkBox.setOnClickListener(View.OnClickListener {
            val check = checkBox.isChecked
            if (check) {
                checkBox.text = status[0]
            } else {
                checkBox.text = status[1]
            }
        })

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

        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText, rootConstraintLayout)

        val check = checkBox.isChecked
        if (check) {
            for (item in clickableViews) {
                item.setOnClickListener { makeColored(it) }
            }
        } else {
            for (item in clickableViews) {
                item.setOnClickListener { makeResource(it) }
            }
        }
    }
}
