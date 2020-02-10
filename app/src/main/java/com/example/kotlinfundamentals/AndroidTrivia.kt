package com.example.kotlinfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.kotlinfundamentals.databinding.ActivityAndroidTriviaBinding

class AndroidTrivia : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityAndroidTriviaBinding>(this, R.layout.activity_android_trivia)
    }
}
