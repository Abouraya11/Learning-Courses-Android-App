package com.example.leado.adapters

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.leado.R
import com.example.leado.models.Course
import com.example.leado.models.Lesson
import com.example.leado.ui.coursedescription.CourseDesc
import kotlinx.android.synthetic.main.activity_course_desc.view.*
import kotlinx.android.synthetic.main.course_item.view.*
import java.util.ArrayList

class CoursesAdapter(private var items: List<Course>) : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
    {
        return BlogViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.course_item,
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
                holder.course = items[position]
            }
        }
    }

    override fun getItemCount(): Int
    {
        return items.size
    }

    class BlogViewHolder constructor(itemView: View, var course: Course? = null):RecyclerView.ViewHolder(itemView)
    {
        private var courseName: TextView = itemView.course_name

        fun bind(course: Course)
        {
            courseName.text = course.name
        }

        init
        {
            itemView.setOnClickListener{
                val i = Intent(itemView.context, CourseDesc::class.java)

                i.putExtra("CourseName", course?.name)
                i.putExtra("CourseRate",course?.rating.toString())
                i.putExtra("CourseNum",course?.numTaken.toString())

                val bundle = Bundle()

                bundle.putParcelableArrayList("Lessons", course?.lessons as ArrayList<out Parcelable>)

                i.putExtras(bundle)

                itemView.context.startActivity(i)
            }
        }
    }
}