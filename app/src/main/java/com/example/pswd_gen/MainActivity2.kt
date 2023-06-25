package com.example.pswd_gen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.input.key.Key.Companion.G

import java.lang.StringBuilder

class MainActivity2:AppCompatActivity()
{
    private lateinit var site:EditText
    private lateinit var pass:EditText
    private lateinit var store:Button
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_2)
        store=findViewById(R.id.store)
        site=findViewById(R.id.Site)
        pass =findViewById(R.id.password)
        val a=site.getText().toString()
        val b=pass.getText().toString()
        store.setOnClickListener()
        {
            storethepass(a,b)
        }
    }
}

private fun storethepass(a:String,b:String)
{

}


