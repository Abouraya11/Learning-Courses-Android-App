package com.example.leado.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.leado.R
import com.example.leado.models.Course
import com.example.leado.models.People
import kotlinx.android.synthetic.main.course_item.view.*
import kotlinx.android.synthetic.main.item_user.view.*


class FriendsAdaptor(private var items: List<People>) : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
    {
        return BlogViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_myfriends,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int)
    {
        when(holder)
        {
            is BlogViewHolder ->
            {
                holder.bind(items[position])
                holder.people = items[position]
            }
        }
    }

    override fun getItemCount(): Int
    {
        return items.size
    }

    class BlogViewHolder constructor(itemView: View, var people: People? = null):RecyclerView.ViewHolder(itemView)
    {
        private var name: TextView = itemView.user_name
        private var image = itemView.user_pp
        private var score = itemView.user_score

        fun bind(people: People)
        {
            name.text = people.name
            image.setImageResource(people.image)
            score.text = people.score.toString()
        }

        init
        {
            itemView.setOnClickListener{
            }
        }
    }
}