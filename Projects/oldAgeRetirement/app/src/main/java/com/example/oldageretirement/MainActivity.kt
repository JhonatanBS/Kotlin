package com.example.oldageretirement

import android.app.Activity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val spinnerSex = findViewById<Spinner>(R.id.spinner_sex)
        val editTextAge = findViewById<EditText>(R.id.edit_text_age)
        val buttonCalculate = findViewById<Button>(R.id.button_calculate)
        val textViewResult = findViewById<TextView>(R.id.text_view_result)

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            listOf("masculino", "feminino"))

        spinnerSex.adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            listOf("masculino", "feminino")
        )

        spinnerSex.adapter = adapter

        buttonCalculate.setOnClickListener {
            val sexSelected = spinnerSex.selectedItem as String

            val age = editTextAge.text.toString().toInt()

            var resultAge = 0

            if(sexSelected == "masculino") {
                resultAge = 65 - age
            }else {
                resultAge = 62 - age
            }

            textViewResult.text = "Faltam $resultAge anos para você se aposentar"
        }
    }
}
