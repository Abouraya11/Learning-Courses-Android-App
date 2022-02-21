package com.example.leado.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.leado.R
import com.example.leado.adapters.CoursesAdapter
import com.example.leado.models.Course
import com.example.leado.models.Lesson
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
        })

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

        val Finance = ArrayList<Lesson>()
        Finance.add(Lesson("Introduction to the Foundations of Financial Management", 1, "18:12", "01"))
        Finance.add(Lesson("The Financial Markets and Interest Rates", 2, "39:17", "02"))
        Finance.add(Lesson("Financial States", 3, "2:19:57", "03"))
        Finance.add(Lesson("Time Value of Money", 4, "41:29", "04"))

        val Art = ArrayList<Lesson>()
        Art.add(Lesson("Drawing", 1, "18:12", "01"))
        Art.add(Lesson("Colour", 2, "39:17", "02"))
        Art.add(Lesson("Explore and Create", 3, "2:19:57", "03"))
        Art.add(Lesson("Refine and fine your way", 4, "41:29", "04"))

        val History = ArrayList<Lesson>()
        History.add(Lesson("Introduction to Leadership", 1, "18:12", "01"))
        History.add(Lesson("Engineering profession", 2, "39:17", "02"))
        History.add(Lesson("Self Awareness", 3, "2:19:57", "03"))
        History.add(Lesson("Stress Management", 4, "41:29", "04"))

        val Probability = ArrayList<Lesson>()
        Probability.add(Lesson("Sample Space", 1, "18:12", "01"))
        Probability.add(Lesson("Binomial,Geometric,Hyper geometric Distributions", 2, "39:17", "02"))
        Probability.add(Lesson("Poisson Distribution", 3, "2:19:57", "03"))
        Probability.add(Lesson("Normal Distribution", 4, "41:29", "04"))

        val Software = ArrayList<Lesson>()
        Software.add(Lesson("Software Process Models", 1, "18:12", "01"))
        Software.add(Lesson("Software Specifications Requirements", 2, "39:17", "02"))
        Software.add(Lesson("UML Diagrams", 3, "2:19:57", "03"))
        Software.add(Lesson("Software Architecture styles", 4, "41:29", "04"))
        Software.add(Lesson("Software Design", 5, "51:29", "05"))
        Software.add(Lesson("Software Cost Estimation", 6, "31:29", "06"))

        val DataMining = ArrayList<Lesson>()
        DataMining.add(Lesson("Introduction of Basic Concepts", 1, "28:12", "01"))
        DataMining.add(Lesson("Applications of data mining", 2, "39:17", "02"))
        DataMining.add(Lesson(" pattern discovery", 3, "1:19:57", "03"))
        DataMining.add(Lesson("cluster analysis", 4, "41:29", "04"))

        val BigData = ArrayList<Lesson>()
        BigData.add(Lesson("Big Data: Why and Where", 1, "18:12", "01"))
        BigData.add(Lesson("Characteristics of Big Data and Dimensions of Scalability", 2, "39:17", "02"))
        BigData.add(Lesson("Data Science: Getting Value out of Big Data", 3, "2:19:57", "03"))
        BigData.add(Lesson("Foundations for Big Data Systems and Programming", 4, "41:29", "04"))
        BigData.add(Lesson(" Systems: Getting Started with Hadoop", 5, "21:29", "05"))

        val items: MutableList<Course> = ArrayList()
        items.add(Course("Personal Branding", personalBrandingLessons, 5,60,3.1))
        items.add(Course("Mind Mapping", mind_mapping, 5,30,4.2))
        items.add(Course("Self Awareness", SelfAwarness, 4,33,2.9))
        items.add(Course("B1 German", B1, 4,33,2.9))
        items.add(Course("Web Development", WebDevelopment, 4,33,2.9))
        items.add(Course("Embedded Systems", EmbeddedSystems, 4,33,2.9))
        items.add(Course("Software", Software, 4,33,2.9))
        items.add(Course("Finance", Finance, 4,33,2.9))
        items.add(Course("Art", Art, 4,33,2.9))
        items.add(Course("Graphic Design", GraphicDesign, 4,33,2.9))
        items.add(Course("History", History, 4,33,2.9))
        items.add(Course("Probability", Probability, 4,33,2.9))
        items.add(Course("Data Mining", DataMining, 4,33,2.9))
        items.add(Course("Big Data", BigData, 4,33,2.9))

        root.recyclerView.adapter=CoursesAdapter(items)
        return root

    }

}