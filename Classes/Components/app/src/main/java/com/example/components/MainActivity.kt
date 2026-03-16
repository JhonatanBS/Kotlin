package com.example.components

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.components.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.buttonToast.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.button_toast -> {
                val toast = Toast.makeText(this, "Toast", Toast.LENGTH_SHORT)
                // toast.setGravity(Gravity.TOP, 50, 50)
                toast.show()
            }
        }
    }
}