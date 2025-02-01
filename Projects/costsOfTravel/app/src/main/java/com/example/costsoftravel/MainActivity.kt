package com.example.costsoftravel

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.costsoftravel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)
        binding.buttonCalculate.setOnClickListener(this)
        //setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_calculate) {
            calculate()
        }
    }

    private fun isValid() : Boolean {
        return (binding.distance.text.toString() != ""
                && binding.price.text.toString() != ""
                && binding.autonomy.text.toString() != ""
                && binding.autonomy.text.toString().toFloat() != 0f)
    }
    
    private fun calculate() {
        if(isValid()) {
            var distance = binding.distance.text.toString().toFloat()
            var price = binding.price.text.toString().toFloat()
            var autonomy = binding.autonomy.text.toString().toFloat()

            var totalValue = (distance / autonomy) * price

            binding.valueTotal.text = "R$${" %.2f".format(totalValue)}"
        }else {
            Toast.makeText(this, R.string.validation_fill_input, Toast.LENGTH_SHORT).show()
        }





    }


}