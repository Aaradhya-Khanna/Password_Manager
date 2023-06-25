package com.example.pswd_gen
import kotlin.random.Random
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.lang.StringBuilder


class MainActivity : AppCompatActivity()
{
    private lateinit var mybutton: Button
    private lateinit var alphas:EditText
    private lateinit var digits:EditText
    private lateinit var specials:EditText
    private lateinit var result:TextView
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mybutton= findViewById(R.id.generate)
        mybutton.setOnClickListener()
        {
            generatepass()
        }

    }
    private fun generatepass()
    {
        alphas = findViewById(R.id.alpha)
        digits = findViewById(R.id.digits)
        specials = findViewById(R.id.special)
        val a = alphas.getText().toString()
        val d = digits.getText().toString()
        val s = specials.getText().toString()
        val num1=a.toInt()
        val num2=d.toInt()
        val num3=s.toInt()
        val alphaset="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnoqrstuvwxyz"
        val digitset="0123456789"
        val specialset="!@#$%^&*()?|{}[]"
        val random=Random(System.nanoTime())
        val password=StringBuilder()
        for(i in 0 until num1)
        {
            val rIndex = random.nextInt(alphaset.length)
            password.append(alphaset[rIndex])
        }
        for(i in 0 until num2)
        {
            val rIndex = random.nextInt(digitset.length)
            password.append(digitset[rIndex])
        }
        for(i in 0 until num3)
        {
            val rIndex = random.nextInt(specialset.length)
            password.append(specialset[rIndex])
        }
        result=findViewById(R.id.result)
        result.setText(password)

    }
}