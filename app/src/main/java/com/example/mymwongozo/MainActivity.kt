package com.example.mymwongozo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var btn_Add:Button
    lateinit var btn_Minus:Button
    lateinit var btn_Multiply:Button
    lateinit var btn_Divide:Button
    lateinit var et_a: EditText
    lateinit var et_b: EditText
    lateinit var resultv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_Add=findViewById(R.id.btn_Add)
        btn_Minus=findViewById(R.id.btn_Minus)
        btn_Multiply=findViewById(R.id.btn_Multiply)
        btn_Divide=findViewById(R.id.btn_Divide)
        et_a=findViewById(R.id.et_a)
        et_b=findViewById(R.id.et_b)
        resultv=findViewById(R.id.result_tv)

        btn_Add.setOnClickListener (this)
        btn_Minus.setOnClickListener(this)
        btn_Multiply.setOnClickListener(this)
        btn_Divide.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var a= et_a.text.toString().toDouble()
        var b=et_b.text.toString().toDouble()
        var result=0.00

        when(v?.id){
            R.id.btn_Add->{
                result=a+b
            }
            R.id.btn_Minus->{
                result=a-b
            }
            R.id.btn_Multiply->{
                result=a*b
            }
            R.id.btn_Divide->{
                result=a/b
            }


        }

        resultv.text="The result is: $result"
    }
}