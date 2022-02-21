package com.example.leado.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.leado.R
import com.example.leado.models.Badge
import kotlinx.android.synthetic.main.badge_item.view.*


class BadgesAdaptor(private var items: List<Badge>) : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
    {
        return BlogViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.badge_item,
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
                holder.badge = items[position]
            }
        }
    }

    override fun getItemCount(): Int
    {
        return items.size
    }

    class BlogViewHolder constructor(itemView: View, var badge: Badge? = null):RecyclerView.ViewHolder(itemView)
    {
        private var badgeName: TextView = itemView.badge_title
        private var badgeDesc: TextView = itemView.badge_desc
        private var badgeImg: ImageView = itemView.badge_image

        fun bind(badge: Badge)
        {
            badgeName.text = badge.title
            badgeDesc.text = badge.desc
            badgeImg.setImageResource(badge.image)
        }

        init
        {
            itemView.setOnClickListener{
            }
        }
    }
}