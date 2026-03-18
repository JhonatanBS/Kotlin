package com.example.components

import android.app.DatePickerDialog
import android.icu.util.Calendar
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import androidx.appcompat.app.AppCompatActivity
import com.example.components.databinding.ActivityTimeBinding

class TimeActivity : AppCompatActivity(), View.OnClickListener, DatePickerDialog.OnDateSetListener {
    private lateinit var binding: ActivityTimeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTimeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.buttonDatePicker.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.button_date_picker -> {
                val dateNow = Calendar.getInstance()
                val year = dateNow.get(Calendar.YEAR)
                val month = dateNow.get(Calendar.MONTH)
                val dayOfMonth = dateNow.get(Calendar.DAY_OF_MONTH)

                DatePickerDialog(this, this, year, month, dayOfMonth).show()
            }
        }
    }

    override fun onDateSet(
        view: DatePicker?,
        year: Int,
        month: Int,
        dayOfMonth: Int
    ) {
        binding.textDatePicker.text = "$dayOfMonth/${month + 1}/$year"
    }

}