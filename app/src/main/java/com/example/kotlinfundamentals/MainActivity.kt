package com.example.kotlinfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    private final val COLORCODES: String[] = {"black", "red", "blue", "green", "yellow","white" }
    private final val COLORNAMES: String[] = {"黒", "赤", "青", "緑", "黄", "白"}

    private var cardList: List<Card>(COLORCODES, COLORNAMES)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
