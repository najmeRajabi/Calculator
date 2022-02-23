package com.example.calculator

class Calculator(private var memory :Double = 0.0){


    fun add(input1:Double , input2:Double):String{
        val result = input1 + input2
        memory = result
        return result.toString()
    }
    fun add(input1:Double ): String {
        val result = input1 + memory
        memory = result
        return result.toString()
    }
    fun subtraction(input1:Double , input2:Double):String{
        val result = input1 - input2
        memory = result
        return result.toString()
    }
    fun subtraction(input1:Double ):String{
        val result =  memory - input1
        memory = result
        return result.toString()
    }
    fun multiplication(input1:Double , input2:Double):String{
        val result = input1 * input2
        memory = result
        return result.toString()
    }
    fun multiplication(input1:Double ):String{
        val result = input1 * memory
        memory = result
        return result.toString()
    }
    fun division(input1:Double , input2:Double):String{
        var result = 0.0
        if (input2 == 0.0){
            println(" division by zero not possible ")
        }
        else {
            result = input1 / input2
            memory = result
        }
        return result.toString()
    }
    fun division(input1:Double ):String{
        var result = 0.0
        if (input1 == 0.0){
            println(" division by zero not possible ")
        }
        else {
            result =  memory / input1
            memory = result
        }
        return result.toString()
    }

}