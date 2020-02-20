package com.example.kotlinfundamentals


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.kotlinfundamentals.databinding.FragmentGuessWordGameBinding


class GuessWordGameFragment : Fragment() {

    private var word = ""

    private var score = 0

    private lateinit var binding: FragmentGuessWordGameBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_guess_word_game,
            container,
            false
        )

        return binding.root
    }

}
