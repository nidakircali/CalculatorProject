package com.nidakircali.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var number1 : Int? =null
    var number2 : Int? =null
    var result : Int? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addition (view: View){

        val firstNumber = findViewById<TextView>(R.id.firstNumber)
        number1 = firstNumber.text.toString().toIntOrNull()

        val secondNumber = findViewById<TextView>(R.id.secondNumber)
        number2 = secondNumber.text.toString().toIntOrNull()

        val resultBox = findViewById<TextView>(R.id.resultBox)


        if (number1== null || number2==null){
            resultBox.text="You should enter two numbers!"

        } else{
            result =number1!! + number2!!
            resultBox.text="${result}"
        }

    }

    fun subtraction (view: View){

        val firstNumber = findViewById<TextView>(R.id.firstNumber)
        number1 = firstNumber.text.toString().toIntOrNull()

        val secondNumber = findViewById<TextView>(R.id.secondNumber)
        number2 = secondNumber.text.toString().toIntOrNull()

        val resultBox = findViewById<TextView>(R.id.resultBox)


        if (number1== null || number2==null){
            resultBox.text="You should enter two numbers!"

        } else{
            result =number1!! - number2!!
            resultBox.text="${result}"
        }

    }

    fun multiplication (view: View){

        val firstNumber = findViewById<TextView>(R.id.firstNumber)
        number1 = firstNumber.text.toString().toIntOrNull()

        val secondNumber = findViewById<TextView>(R.id.secondNumber)
        number2 = secondNumber.text.toString().toIntOrNull()

        val resultBox = findViewById<TextView>(R.id.resultBox)


        if (number1== null || number2==null){
            resultBox.text="You should enter two numbers!"
        }
            else{
            result =number1!! * number2!!
            resultBox.text="${result}"
        }

    }

    fun division (view: View){

        val firstNumber = findViewById<TextView>(R.id.firstNumber)
        number1 = firstNumber.text.toString().toIntOrNull()

        val secondNumber = findViewById<TextView>(R.id.secondNumber)
        number2 = secondNumber.text.toString().toIntOrNull()

        val resultBox = findViewById<TextView>(R.id.resultBox)


        if (number1== null || number2==null){
            resultBox.text="You should enter two numbers!" }

        else if (number2==0) {
            resultBox.text="Denominator cannot be 0 in division!"

        }
        else{
            result =number1!! / number2!!
            resultBox.text="${result}"
        }

    }


}