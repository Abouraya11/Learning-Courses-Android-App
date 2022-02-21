package com.example.leado.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.leado.R
import com.example.leado.adapters.MyCoursesAdapter
import com.example.leado.models.Course
import com.example.leado.models.Lesson
import kotlinx.android.synthetic.main.fragment_my_courses.view.*

class MyCourses : Fragment()
{

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root =  inflater.inflate(R.layout.fragment_my_courses, container, false)

        val personalBrandingLessons = ArrayList<Lesson>()
        personalBrandingLessons.add(Lesson("Introduction", 1, "28:12", "01"))
        personalBrandingLessons.add(Lesson("An Overview of Personal Branding", 2, "49:17", "02"))
        personalBrandingLessons.add(Lesson("Building your Brand's Infrastructure", 3, "1:19:57", "03"))
        personalBrandingLessons.add(Lesson("Establishing Your Brand's Digital Home", 4, "51:29", "04"))
        personalBrandingLessons.add(Lesson("Creating your Brand's Maintenance Plan", 5, "35:43", "05"))

        val mind_mapping = ArrayList<Lesson>()
        mind_mapping.add(Lesson("Mind Maps Explained", 1, "29:12", "01"))
        mind_mapping.add(Lesson("Stuff you need to get started mind mapping", 2, "59:17", "02"))
        mind_mapping.add(Lesson("7 effective steps to mind mapping", 3, "1:19:57", "03"))
        mind_mapping.add(Lesson("Visualise your mind map", 4, "50:29", "04"))
        mind_mapping.add(Lesson("Unlocking the Brains power", 5, "39:43", "05"))

        val SelfAwarness = ArrayList<Lesson>()
        SelfAwarness.add(Lesson("Introduction to Leadership", 1, "18:12", "01"))
        SelfAwarness.add(Lesson("Engineering profession", 2, "39:17", "02"))
        SelfAwarness.add(Lesson("Self Awareness", 3, "2:19:57", "03"))
        SelfAwarness.add(Lesson("Stress Management", 4, "41:29", "04"))

        val WebDevelopment = ArrayList<Lesson>()
        WebDevelopment.add(Lesson("Html", 1, "2:18:12", "01"))
        WebDevelopment.add(Lesson("CSS", 2, "39:17", "02"))
        WebDevelopment.add(Lesson("Introduction to bootstrap", 3, "2:19:57", "03"))
        WebDevelopment.add(Lesson("JavaScript", 4, "41:29", "04"))

        val B1 = ArrayList<Lesson>()
        B1.add(Lesson("Lesen", 1, "18:12", "01"))
        B1.add(Lesson("Schreiben", 2, "39:17", "02"))
        B1.add(Lesson("Hören", 3, "2:19:57", "03"))
        B1.add(Lesson("Sprechen", 4, "41:29", "04"))

        val EmbeddedSystems = ArrayList<Lesson>()
        EmbeddedSystems.add(Lesson("Introduction to Embedded System", 1, "18:12", "01"))
        EmbeddedSystems.add(Lesson("Full C programming", 2, "39:17", "02"))
        EmbeddedSystems.add(Lesson("Data Structures and algorithms", 3, "2:19:57", "03"))
        EmbeddedSystems.add(Lesson("Software", 4, "41:29", "04"))
        EmbeddedSystems.add(Lesson("MicroController", 4, "51:29", "05"))

        val GraphicDesign = ArrayList<Lesson>()
        GraphicDesign.add(Lesson("Introduction to Graphic Design", 1, "18:12", "01"))
        GraphicDesign.add(Lesson("Design Basics", 2, "39:17", "02"))
        GraphicDesign.add(Lesson("Introduction to Typography", 3, "2:19:57", "03"))
        GraphicDesign.add(Lesson("Advanced Typography", 4, "41:29", "04"))

        var courses = ArrayList<Course>()
        courses.add(Course("Personal Branding",personalBrandingLessons,progress = 32))
        courses.add(Course("Mind Mapping",mind_mapping,progress = 60))
        courses.add(Course("Self Awareness",SelfAwarness,progress = 42))
        courses.add(Course("Web Development",WebDevelopment,progress = 52))
        courses.add(Course("B1 German",B1,progress = 100))
        courses.add(Course("Embedded Systems",EmbeddedSystems,progress = 85))
        courses.add(Course("Graphic Design",GraphicDesign,progress = 15))
        root.myCourses_rv.adapter = MyCoursesAdapter(courses)

        return root
    }

}