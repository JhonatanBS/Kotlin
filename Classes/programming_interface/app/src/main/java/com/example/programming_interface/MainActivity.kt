package com.example.programming_interface

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

import com.example.programming_interface.databinding.ActivityMainBinding

class MainActivity : ComponentActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener(this)
        binding.buttonRegister.setOnClickListener(this)
        }

    override fun onClick(v: View) {
        if(v.id == R.id.button_login) {
            val email = binding.edittextEmail.text.toString()
            val password = binding.editTextPassword.text.toString()

            if(email.isNotEmpty() && password.isNotEmpty()) {
                val bundle = Bundle()
                bundle.putString("EMAIL", email)

                val intentNavigation = Intent(this, HomeActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intentNavigation)

            } else {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
            }

        }else if(v.id == R.id.button_register) {
            println()
        }
    }

    }

