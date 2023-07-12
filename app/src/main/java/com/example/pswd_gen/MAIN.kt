package com.example.pswd_gen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MAIN :AppCompatActivity()
{
    private lateinit var store: Button
    private lateinit var gen: Button
    private lateinit var show:Button
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        gen=findViewById(R.id.gen_pass)
        gen.setOnClickListener()
        {
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        store=findViewById(R.id.store)
        store.setOnClickListener()
        {
            val intent= Intent(this, MainActivity2::class.java)

        }
        show=findViewById(R.id.show_pass)
        show.setOnClickListener()
        {
            val intent=Intent(this,view::class.java)
            startActivity(intent)
        }
    }
}