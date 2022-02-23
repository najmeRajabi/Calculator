package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.calculator.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityMainBinding
    private var valueEntry = ""
    var valueEntry2 = ""
    private var numberOne = 0.0
    var numberTow = 0.0
    private var operator = ""
    var answer = ""
    val calculator = Calculator()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        onclickButtons()
    }

    private fun onclickButtons() {
        binding.btn0.setOnClickListener(this)
        binding.btn1.setOnClickListener(this)
        binding.btn2.setOnClickListener(this)
        binding.btn3.setOnClickListener(this)
        binding.btn4.setOnClickListener(this)
        binding.btn5.setOnClickListener(this)
        binding.btn6.setOnClickListener(this)
        binding.btn7.setOnClickListener(this)
        binding.btn8.setOnClickListener(this)
        binding.btn9.setOnClickListener(this)
        binding.btnDot.setOnClickListener(this)
        binding.btnEqual.setOnClickListener(this)
        binding.divisionBtn.setOnClickListener(this)
        binding.deleteBtn.setOnClickListener(this)
        binding.btnPlus.setOnClickListener(this)
        binding.btnMultiplication.setOnClickListener(this)
        binding.btnMinus.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0) {
            binding.btn0 -> {
                toast("0")
                entry("0")
                entryNumbers("0")
                clickableOperators()
            }
            binding.btn1 -> {
                toast("1")
                entry("1")
                entryNumbers("1")
                clickableOperators()
            }
            binding.btn2 -> {
                toast("2")
                entry("2")
                entryNumbers("2")
                clickableOperators()
            }
            binding.btn3 -> {
                toast("3")
                entry("3")
                entryNumbers("3")
                clickableOperators()
            }
            binding.btn4 -> {
                toast("4")
                entry("4")
                entryNumbers("4")
                clickableOperators()
            }
            binding.btn5 -> {
                toast("5")
                entry("5")
                entryNumbers("5")
                clickableOperators()
            }
            binding.btn6 -> {
                toast("6")
                entry("6")
                entryNumbers("6")
                clickableOperators()
            }
            binding.btn7 -> {
                toast("7")
                entry("7")
                entryNumbers("7")
                clickableOperators()
            }
            binding.btn8 -> {
                toast("8")
                entry("8")
                entryNumbers("8")
                clickableOperators()
            }
            binding.btn9 -> {
                toast("9")
                entry("9")
                entryNumbers("9")
                clickableOperators()
            }
            binding.btnDot -> {
                toast(".")
                entry(".")
                entryNumbers(".")
                binding.btnDot.isClickable = false
            }
            binding.btnEqual -> {
                toast("=")
                equals()
                binding.btnDot.isClickable = true

            }
            binding.divisionBtn -> {
                toast("/")
                clickOperator("/")
                entry("/")
                binding.btnDot.isClickable = true
                notClickableOperators()
            }
            binding.deleteBtn -> {
                toast("delete")
                valueEntry = ""
                binding.calculateTxv.text = ""
                binding.answerTxv.text = ""
                binding.btnDot.isClickable = true
            }
            binding.btnPlus -> {
                toast("+")
                clickOperator("+")
                entry(" + ")
                binding.btnDot.isClickable = true
                notClickableOperators()
            }
            binding.btnMinus -> {
                toast("-")
                clickOperator("-")
                entry(" - ")
                binding.btnDot.isClickable = true
                notClickableOperators()
            }
            binding.btnMultiplication -> {
                toast("*")
                clickOperator("*")
                entry(" * ")
                binding.btnDot.isClickable = true
                notClickableOperators()
            }
        }
    }

    private fun toast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun entry(entry: String) {
        valueEntry += entry
        binding.calculateTxv.text = valueEntry
    }

    private fun entryNumbers(entry: String) {
        valueEntry2 += entry
    }

    private fun clickableOperators() {
        binding.btnMultiplication.isClickable = true
        binding.btnMinus.isClickable = true
        binding.btnPlus.isClickable = true
        binding.divisionBtn.isClickable = true
    }

    private fun notClickableOperators() {
        binding.btnMultiplication.isClickable = false
        binding.btnMinus.isClickable = false
        binding.btnPlus.isClickable = false
        binding.divisionBtn.isClickable = false
    }

    private fun equals() {

        if (valueEntry2 == "" ||
            valueEntry2.substring(valueEntry2.lastIndex) == "."
        ) {

            toast("enter a number! please")
        } else {
            numberTow = valueEntry2.toDouble()

            if (numberOne == 0.0) {
                answer = when (operator) {
                    "+" -> calculator.add(numberTow)
                    "-" -> calculator.subtraction(numberTow)
                    "*" -> calculator.multiplication(numberTow)
                    "/" -> calculator.division(numberTow)
                    else -> {
                        "error"
                    }
                }
            } else {
                answer = when (operator) {
                    "+" -> calculator.add(numberOne, numberTow)
                    "-" -> calculator.subtraction(numberOne, numberTow)
                    "*" -> calculator.multiplication(numberOne, numberTow)
                    "/" -> calculator.division(numberOne, numberTow)
                    else -> {
                        "error"
                    }
                }
            }

            valueEntry = ""
            valueEntry2 = ""
            binding.answerTxv.text = answer
            numberOne = 0.0
            numberTow = 0.0
        }
    }

    private fun clickOperator(operator: String) {
        numberOne = if (valueEntry2 == "") {
            0.0
        } else {
            valueEntry2.toDouble()
        }
        this.operator = operator
        valueEntry2 = ""

    }

}