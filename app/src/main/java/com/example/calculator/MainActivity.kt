package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var num1=findViewById<EditText>(R.id.etFirstNumber)
        var num2=findViewById<EditText>(R.id.etSecondNumber2)
        var answer=findViewById<TextView>(R.id.etAns)

        var add=findViewById<Button>(R.id.tvbtnbutton4)
        var subtract=findViewById<Button>(R.id.tvbtnButton5)
        var multiply=findViewById<Button>(R.id.tvbtnButton6)
        var division=findViewById<Button>(R.id.tvButton7)
        
        add.setOnClickListener {
            Toast.makeText(baseContext, "add", Toast.LENGTH_LONG).show()
            var num1= num1.text.toString().toInt()
            var num2 = num2.text.toString().toInt()
            var add=num1+num2
            answer.text=("$add")


        }
        subtract.setOnClickListener {
            Toast.makeText(baseContext, "subtract", Toast.LENGTH_LONG).show()
            var num1= num1.text.toString().toInt()
            var num2 = num2.text.toString().toInt()
            var subtract=num1-num2
            answer.text=("$subtract")

        }
        multiply.setOnClickListener {
            Toast.makeText(baseContext, "inputNumber", Toast.LENGTH_LONG).show()
            var num1= num1.text.toString().toInt()
            var num2 = num2.text.toString().toInt()
            var multiply=num1*num2
            answer.text=("$multiply")

        }
        division.setOnClickListener {
            Toast.makeText(baseContext, "inputNumber", Toast.LENGTH_LONG).show()
            var num1= num1.text.toString().toInt()
            var num2 = num2.text.toString().toInt()
            var division=num1%num2
            answer.text=("$division")

        }
        

    }
}