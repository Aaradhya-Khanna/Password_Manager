package com.example.pswd_gen
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val passwordList : ArrayList<passwords> ) : RecyclerView.Adapter<Adapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder
    {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.recycler,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val currentView=passwordList[position]
        holder.pass.text=currentView.password
        holder.site.text=currentView.site
        holder.type.text=currentView.type
    }

    override fun getItemCount(): Int {
        return passwordList.size
    }
    class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
        val site: TextView = itemView.findViewById(R.id.textView)
        val pass:TextView = itemView.findViewById(R.id.textView2)
        val type:TextView = itemView.findViewById(R.id.textView3)

    }
}