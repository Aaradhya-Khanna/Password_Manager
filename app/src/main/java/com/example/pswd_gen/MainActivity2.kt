package com.example.pswd_gen

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
class MainActivity2:AppCompatActivity()
{
    private lateinit var site:EditText
    private lateinit var pass:EditText
    private lateinit var store:Button
    private lateinit var db: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_2)
        store=findViewById(R.id.store)
        site=findViewById(R.id.Site)
        pass =findViewById(R.id.password)
        val a=site.getText()
        val b=pass.getText()
        db = FirebaseDatabase.getInstance().getReference("Passwords" )
        store.setOnClickListener()
        {
            val a=site.getText()
            val b=pass.getText()
            val pswds=passwords(b.toString(),a.toString(),"Stored")
            db.child(a.toString()).setValue(pswds).addOnSuccessListener {
                Toast.makeText(this,"Successfully Saved",Toast.LENGTH_SHORT).show()
            }
        }
    }
}




