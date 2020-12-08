package com.example.randomnumbergenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    private fun init(){
        randomNumber.setOnClickListener {
            d("ButtonClicked","number is")
            val number1:Int = randnum()
            generatedNumber.text = number1.toString()
            if (number1 > 0 && number1 % 5 == 0) {yesNo.text = "yep"}
            else {yesNo.text = "Nope"}
        }
    }
    private fun randnum():Int{
        return (-101 until 101).random()
    }
}