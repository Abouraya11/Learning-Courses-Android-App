package com.example.leado.adapters
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.leado.models.People
import com.example.leado.R
import kotlinx.android.synthetic.main.item_user.view.*

class PeoplesAdapter(val list:ArrayList<People>) : RecyclerView.Adapter<PeoplesAdapter.viewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
       val layoutinflater=LayoutInflater.from(parent.context).inflate(R.layout.item_user,parent,false)
        return viewHolder(layoutinflater)
    }

    override fun getItemCount(): Int
    {
        return list.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
       val List= list.get(position)
        val newRank=position+4
        holder.personName.text=List.name
        holder.Score.text=List.score.toString()
        holder.Rank.text=newRank.toString()
        holder.image.setImageResource(List.image)
    }

    inner class viewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val personName: TextView =itemView.user_name
        val Score: TextView =itemView.user_score
        val Rank: TextView =itemView.user_rank
        val image=itemView.user_pp
    }
}