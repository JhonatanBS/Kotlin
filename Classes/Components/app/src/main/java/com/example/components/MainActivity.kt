package com.example.components

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.components.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener, AdapterView.OnItemSelectedListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.buttonToast.setOnClickListener(this)
        binding.buttonSnack.setOnClickListener(this)

        binding.buttonGetSpinner.setOnClickListener(this)
        binding.buttonSetSpinner.setOnClickListener(this)
        binding.spinnerDinamico.onItemSelectedListener = this

        // loadSpinner()
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

            R.id.button_get_spinner -> {

                loadSpinner()

                /*  val str = binding.spinnerDinamico.selectedItem

                  val id1 = binding.spinnerDinamico.selectedItemId
                  val id2 = binding.spinnerDinamico.selectedItemPosition
                */
            }

            R.id.button_set_spinner -> {
                //binding.spinnerDinamico.setSelection(2)
                binding.spinnerDinamico.adapter = null
            }
        }
    }

    override fun onItemSelected(
        parent: AdapterView<*>,
        view: View,
        position: Int,
        id: Long
    ) {
        Toast.makeText(this, "$position - $id", Toast.LENGTH_SHORT).show()
    }

    override fun onNothingSelected(parent: AdapterView<*>) {
        Toast.makeText(this, "Nothing", Toast.LENGTH_SHORT).show()
    }

    private fun loadSpinner() {
        val list = listOf("Gramas", "Kg", "Arroba", "Tonelada")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, list)

        binding.spinnerDinamico.adapter = adapter
    }


}