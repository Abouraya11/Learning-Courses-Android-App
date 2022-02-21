package com.example.leado.ui.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.leado.R
import com.example.leado.adapters.CoursesAdapter
import com.example.leado.models.Course
import com.example.leado.models.Lesson
import kotlinx.android.synthetic.main.fragment_search.*


class SearchFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val prog1 = ArrayList<Lesson>()
        prog1.add(Lesson("Introduction", 1, "28:12", "01"))
        prog1.add(Lesson("Variables declaration, Arithmetic Operations", 2, "49:17", "02"))
        prog1.add(Lesson("Loops, Ifs, Switch case", 3, "1:19:57", "03"))
        prog1.add(Lesson("Functions and Recursive functions", 4, "51:29", "04"))
        prog1.add(Lesson("Arrays", 5, "1:35:43", "05"))
        prog1.add(Lesson("Strings", 6, "35:43", "06"))

        val prog2 = ArrayList<Lesson>()
        prog2.add(Lesson("Introduction to OOP", 1, "28:12", "01"))
        prog2.add(Lesson("OOP Concepts and Classes", 2, "49:17", "02"))
        prog2.add(Lesson("Encapsulation and Inheritance", 3, "1:19:57", "03"))
        prog2.add(Lesson("Polymorphism", 4, "51:29", "04"))
        prog2.add(Lesson("GUI", 5, "35:43", "05"))
        prog2.add(Lesson("Multithreading", 6, "1:35:43", "06"))

        val phy1 = ArrayList<Lesson>()
        phy1.add(Lesson("Simple Harmonic Motion", 1, "28:12", "01"))
        phy1.add(Lesson("Driven vibrations and resonance", 2, "49:17", "02"))
        phy1.add(Lesson("Vibrations of continuous systems", 3, "1:19:57", "03"))
        phy1.add(Lesson("Properties of sound and electromagnetic waves", 4, "51:29", "04"))
        phy1.add(Lesson("Polarization", 5, "35:43", "05"))

        val phy2 = ArrayList<Lesson>()
        phy2.add(Lesson("Electrostatics", 1, "28:12", "01"))
        phy2.add(Lesson("Magnetostatics", 2, "49:17", "02"))
        phy2.add(Lesson("Dielectrics ", 3, "1:19:57", "03"))
        phy2.add(Lesson("Magnetic materials", 4, "51:29", "04"))
        phy2.add(Lesson("Electromagnetic waves", 5, "35:43", "05"))


        val recentList = ArrayList<Course>()
        recentList.add(Course("Programming 1", prog1,6,70,4.1))
        recentList.add(Course("Advanced Programming", prog2,6,60,3.9))
        recentList.add(Course("Physics 1", phy1,5,83,4.7))
        recentList.add(Course("Physics 2", phy2,5,26,4.1))

        recentlyRV.adapter = CoursesAdapter(recentList)

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

        val Finance = ArrayList<Lesson>()
        Finance.add(Lesson("Introduction to the Foundations of Financial Management", 1, "18:12", "01"))
        Finance.add(Lesson("The Financial Markets and Interest Rates", 2, "39:17", "02"))
        Finance.add(Lesson("Financial States", 3, "2:19:57", "03"))
        Finance.add(Lesson("Time Value of Money", 4, "41:29", "04"))

       val recommendList = ArrayList<Course>()
        recommendList.add(Course("Finance", Finance, 4,90, 3.8))
        recommendList.add(Course("Graphic Desgin", GraphicDesign, 4, 120, 4.3))
        recommendList.add(Course("Physics 1", phy1,5,83,4.7))
        recommendList.add(Course("Advanced Programming", prog2,6,60,3.9))

        recommendedRV.adapter = CoursesAdapter(recommendList)
    }

}