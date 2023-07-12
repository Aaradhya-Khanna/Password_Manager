package com.example.pswd_gen
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class view:AppCompatActivity()
{
    private lateinit var databaseReference: DatabaseReference
    private lateinit var recycler : RecyclerView
    private var data=ArrayList<passwords>()
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycler)
        recycler = findViewById(R.id.view)
        recycler.layoutManager=LinearLayoutManager(this)

        data= arrayListOf<passwords>()
        getuserData()
    }

    private fun getuserData()
    {
        databaseReference = FirebaseDatabase.getInstance().getReference("Passwords Generated")
        databaseReference.addValueEventListener(object:ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                if(snapshot.exists())
                {
                    for(userSnapshot in snapshot.children)
                    {
                        val pswd=userSnapshot.getValue(passwords::class.java)
                        data.add(pswd!!)

                    }
                    recycler.adapter = Adapter(data)
                }
            }

            override fun onCancelled(error: DatabaseError) {

            }

        })

    }
}
