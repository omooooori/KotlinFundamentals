package com.example.kotlinfundamentals


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavHost
import androidx.navigation.fragment.NavHostFragment
import com.example.kotlinfundamentals.databinding.FragmentGuessWordGameBinding


class GuessWordGameFragment : Fragment() {

    private lateinit var binding: FragmentGuessWordGameBinding

    private lateinit var viewModel: GameViewModel

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

        Log.i("GameFragment", "Called ViewModelProvider.of")
        viewModel = ViewModelProviders.of(this).get(GameViewModel::class.java)

        binding.correctButton.setOnClickListener { onCorrect() }
        binding.skipButton.setOnClickListener { onSkip() }
        binding.endGameButton.setOnClickListener { onEndGame() }
        updateScoreText()
        updateWordText()

        return binding.root
    }

    private fun onSkip() {
        viewModel.onSkip()
        updateWordText()
        updateScoreText()
    }

    private fun onCorrect() {
        viewModel.onCorrect()
        updateWordText()
        updateScoreText()
    }

    private fun onEndGame() {
        gameFinished()
    }

    private fun updateWordText() {
        binding.wordText.text = viewModel.word
    }

    private fun updateScoreText() {
        binding.scoreText.text = viewModel.score.toString()
    }

    private fun gameFinished() {
        Toast.makeText(activity, "Game has just finished", Toast.LENGTH_SHORT).show()
        val action = GuessWordGameFragmentDirections.actionGameDestinationToScoreDestination()
        action.score = viewModel.score
        NavHostFragment.findNavController(this).navigate(action)
    }
}
