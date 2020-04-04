package com.example.kotlinfundamentals.guesswordgame.screens.title

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.kotlinfundamentals.R
import com.example.kotlinfundamentals.databinding.FragmentGuessWordTitleBinding


class GuessWordTitleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentGuessWordTitleBinding =  DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_guess_word_title,
            container,
            false)

        binding.playGameButton.setOnClickListener {
            findNavController().navigate(R.id.action_title_destination_to_game_destination)
        }

        return binding.root
    }

}
