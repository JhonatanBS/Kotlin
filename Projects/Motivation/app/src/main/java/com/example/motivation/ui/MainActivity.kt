package com.example.motivation.ui

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.motivation.helper.MotivationConstants
import com.example.motivation.repository.PhraseRepository
import com.example.motivation.R
import com.example.motivation.databinding.ActivityMainBinding
import com.example.motivation.repository.SecurityPreferences

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var securityPreferences: SecurityPreferences
    private val phraseRepositoy = PhraseRepository()
    private var filter: Int = MotivationConstants.PHRASE.ALL

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate((layoutInflater))

        setContentView(binding.root)

        securityPreferences = SecurityPreferences(this)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom)
            insets
        }

        setListeners()
        getUserName()
        handleFilter(R.id.image_all)
        refreshPhrase()
    }

    override fun onClick(v: View) {
        val listId = listOf(
            R.id.image_all, R.id.image_happy, R.id.image_sunny
        )

        if(v.id == R.id.button_newPhrase) {
            refreshPhrase()
        } else if(v.id in listId) {
            handleFilter(v.id)
        }
    }

    private fun refreshPhrase() {
        binding.textPhase.text = phraseRepositoy.getPhrase(filter)
    }

    private fun handleFilter(id: Int) {
        binding.imageAll.setColorFilter(ContextCompat.getColor(this, R.color.purple_dark))
        binding.imageHappy.setColorFilter(ContextCompat.getColor(this, R.color.purple_dark))
        binding.imageSunny.setColorFilter(ContextCompat.getColor(this, R.color.purple_dark))

        when(id) {
            R.id.image_all -> {
                filter = MotivationConstants.PHRASE.ALL
                binding.imageAll.setColorFilter(ContextCompat.getColor(this, R.color.white))
            }
            R.id.image_happy -> {
                filter = MotivationConstants.PHRASE.HAPPY
                binding.imageHappy.setColorFilter(ContextCompat.getColor(this, R.color.white))
            }
            R.id.image_sunny -> {
                filter = MotivationConstants.PHRASE.SUNNY
                binding.imageSunny.setColorFilter(ContextCompat.getColor(this, R.color.white))
            }
        }
    }

    private fun getUserName() {
        val name = securityPreferences.getString(MotivationConstants.KEY.PERSON_NAME)
        binding.textWelcome.text = name
    }

    private fun setListeners() {
        binding.buttonNewPhrase.setOnClickListener(this)
        binding.imageAll.setOnClickListener(this)
        binding.imageHappy.setOnClickListener(this)
        binding.imageSunny.setOnClickListener(this)
    }

}