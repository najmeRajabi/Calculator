package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.calculator.databinding.ActivityMainBinding

lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() , View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        onclickButtons()
    }

    private fun onclickButtons() {
        binding.btn0.setOnClickListener (this)
        binding.btn1.setOnClickListener (this)
        binding.btn2.setOnClickListener (this)
        binding.btn3.setOnClickListener (this)
        binding.btn4.setOnClickListener (this)
        binding.btn5.setOnClickListener (this)
        binding.btn6.setOnClickListener (this)
        binding.btn7.setOnClickListener (this)
        binding.btn8.setOnClickListener (this)
        binding.btn9.setOnClickListener (this)
        binding.btnDot.setOnClickListener (this)
        binding.btnEqual.setOnClickListener(this)
        binding.divisionBtn.setOnClickListener(this)
        binding.deleteBtn.setOnClickListener(this)
        binding.btnPlus.setOnClickListener(this)
        binding.btnMultiplication.setOnClickListener(this)
        binding.btnMinus.setOnClickListener(this)
    }



    override fun onClick(p0: View?) {
        when (p0){
            binding.btn0 -> toast("0")
            binding.btn1 -> toast("1")
            binding.btn2 -> toast("2")
            binding.btn3 -> toast("3")
            binding.btn4 -> toast("4")
            binding.btn5 -> toast("5")
            binding.btn6 -> toast("6")
            binding.btn7 -> toast("7")
            binding.btn8 -> toast("8")
            binding.btn9 -> toast("9")
            binding.btnDot -> toast(".")
            binding.btnDot -> toast(".")
            binding.btnEqual -> toast("=")
            binding.divisionBtn -> toast("/")
            binding.deleteBtn -> toast("delete")
            binding.btnPlus -> toast("+")
            binding.btnMinus -> toast("-")
            binding.btnMultiplication -> toast("*")
        }
    }
    private fun toast(message :String){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }
}