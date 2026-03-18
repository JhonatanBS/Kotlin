package com.example.components

import android.app.TimePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.TimePicker
import androidx.appcompat.app.AppCompatActivity
import com.example.components.databinding.ActivityTimeBinding

class TimeActivity : AppCompatActivity(), View.OnClickListener, TimePickerDialog.OnTimeSetListener {
    private lateinit var binding: ActivityTimeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTimeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.buttonTimePicker.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.button_time_picker -> {
                TimePickerDialog(this, this, 20, 15, true).show()
            }
        }
    }

    override fun onTimeSet(
        view: TimePicker,
        hourOfDay: Int,
        minute: Int
    ) {
        binding.textTimePicker.text = "$hourOfDay:$minute"
    }
}