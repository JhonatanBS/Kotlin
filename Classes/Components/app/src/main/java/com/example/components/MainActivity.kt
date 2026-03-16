package com.example.components

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.components.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.buttonToast.setOnClickListener(this)
        binding.buttonSnack.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.button_toast -> {
                val toast = Toast.makeText(this, "Toast", Toast.LENGTH_SHORT)
                // toast.setGravity(Gravity.TOP, 50, 50)
                toast.show()
            }

            R.id.button_snack -> {
                val snack = Snackbar.make(binding.linearRoot, "Snack", Snackbar.LENGTH_SHORT)

                snack.setTextColor(Color.WHITE)
                snack.setBackgroundTint(Color.BLUE)

                snack.setAction("Desfazer", View.OnClickListener {
                    Snackbar.make(binding.linearRoot, "Desfeito!", Snackbar.LENGTH_SHORT).show()
                })

                snack.setActionTextColor(Color.BLACK)

                snack.show()
            }
        }
    }
}