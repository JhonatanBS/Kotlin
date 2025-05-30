package com.example.programming_interface

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.programming_interface.business.UserBusiness

import com.example.programming_interface.databinding.ActivityMainBinding
import com.example.programming_interface.utils.AppConstants

class MainActivity : ComponentActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private val userBusiness = UserBusiness()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.buttonLogin.setOnClickListener(this)
        binding.buttonRegister.setOnClickListener(this)
        }

    override fun onClick(v: View) {
        if(v.id == R.id.button_login) {
            val email = binding.edittextEmail.text.toString()
            val password = binding.editTextPassword.text.toString()

            if(userBusiness.checkCredentials(email, password)) {
                val bundle = Bundle()
                bundle.putString(AppConstants.EMAIL_KEY, email)

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

