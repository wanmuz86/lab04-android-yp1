package com.muzaffar.lab04

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.muzaffar.lab04.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // the step is used to link the UI created in XML to our Kotlin file
        // 3 Step
        // ENable {viewBinding} in gradle.kts
        // Initialize binding object
        // set content view to binding root
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Bila button yang ber id buttonPlus ditekan
        binding.buttonPlus.setOnClickListener {
            // Dapatkan nilai dari editText1 dan editText2  = binding.editText1.text.toString()
            // TUkarkan ke integer = toInt()
            val num1 = binding.editText1.text.toString().toInt()
            val num2 = binding.editText2.text.toString().toInt()
            // Dapatkan hasil tambahkan num1 dan num2
            val sum = num1 + num2;
            // Keluarkan result ke textview dengan id resultTextView
            binding.resultTextView.text = "Result: $sum"
        }

        binding.buttonMinus.setOnClickListener {
            val num1 = binding.editText1.text.toString().toInt()
            val num2 = binding.editText2.text.toString().toInt()
            val minus = num1-num2
            binding.resultTextView.text = "Result: $minus"
        }

        binding.buttonProduct.setOnClickListener {
            val num1 =binding.editText1.text.toString().toInt()
            val num2 = binding.editText2.text.toString().toInt()
            val product = num1 * num2;
            binding.resultTextView.text = "Result: $product"
        }

        binding.buttonDivide.setOnClickListener {
            val num1 = binding.editText1.text.toString().toDouble()
            val num2 = binding.editText2.text.toString().toDouble()
            val division = num1 / num2
            binding.resultTextView.text = "Result: $division"
        }



    }
}