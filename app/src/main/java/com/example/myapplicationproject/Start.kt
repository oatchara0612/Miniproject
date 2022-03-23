package com.example.myapplicationproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class Start : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        var numberinput=findViewById<EditText>(R.id.number)
        var cal=findViewById<Button>(R.id.cal)
        var result=findViewById<TextView>(R.id.result)
        var cm_button=findViewById<RadioButton>(R.id.cm)

        cal.setOnClickListener {
            if (cm_button.isChecked) {
             result.text = (numberinput.text.toString().toDouble() / 100000).toString()
                Log.v("Result",result.text.toString())
            }else{
                result.text= (numberinput.text.toString().toDouble()/1000).toString()
            Log.v("Result",result.text.toString())
        }
    }
}
}
