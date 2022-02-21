package com.example.leado.ui.coursedescription

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.leado.R
import com.example.leado.adapters.LessonsAdaptor
import com.example.leado.models.Lesson
import kotlinx.android.synthetic.main.activity_course_desc.*
import kotlinx.android.synthetic.main.course_lesson_item.*

class CourseDesc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_desc)

        course_name_in_desc.text = intent.getStringExtra("CourseName")
        course_rating.text = intent.getStringExtra("CourseRate")
        course_taken_num.text=intent.getStringExtra("CourseNum")+"K"

        val lessons = intent.extras?.getParcelableArrayList<Lesson>("Lessons")

        lessonRV.adapter = lessons?.let { LessonsAdaptor(it) }
    }
}