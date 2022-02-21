package com.example.leado.ui.profile

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import com.example.leado.R
import kotlinx.android.synthetic.main.fragment_profile_main.*

class ProfileFragmentMain : Fragment() {

     private lateinit var semiBold: Typeface
     private lateinit var regular : Typeface
     val badgesFragment = Badges()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_profile_main, container, false)

        semiBold = ResourcesCompat.getFont(requireContext(), R.font.montserrat_semibold)!!
        regular = ResourcesCompat.getFont(requireContext(), R.font.montserrat_regular)!!

        childFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, badgesFragment)
            commit()
        }
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val myCoursesFragment = MyCourses()
        val myFriendsFragment = MyFriends()
        val aboutMeFragment = AboutMe()

        myBadges_btn.setOnClickListener {
            myBadges_btn.setTextColor(Color.parseColor("#000000"))
            myBadges_btn.typeface = semiBold

            myCourses_btn.setTextColor(Color.parseColor("#808080"))
            myCourses_btn.typeface = regular
            friends_btn.setTextColor(Color.parseColor("#808080"))
            friends_btn.typeface = regular
            aboutMe_btn.setTextColor(Color.parseColor("#808080"))
            aboutMe_btn.typeface = regular

            childFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, badgesFragment)
                commit()
            }
        }

        myCourses_btn.setOnClickListener{
            myCourses_btn.setTextColor(Color.parseColor("#000000"))
            myCourses_btn.typeface = semiBold

            myBadges_btn.setTextColor(Color.parseColor("#808080"))
            myBadges_btn.typeface = regular
            friends_btn.setTextColor(Color.parseColor("#808080"))
            friends_btn.typeface = regular
            aboutMe_btn.setTextColor(Color.parseColor("#808080"))
            aboutMe_btn.typeface = regular

            childFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, myCoursesFragment)
                commit()
            }
        }

        friends_btn.setOnClickListener{
            friends_btn.setTextColor(Color.parseColor("#000000"))
            friends_btn.typeface = semiBold

            myBadges_btn.setTextColor(Color.parseColor("#808080"))
            myBadges_btn.typeface = regular
            myCourses_btn.setTextColor(Color.parseColor("#808080"))
            myCourses_btn.typeface = regular
            aboutMe_btn.setTextColor(Color.parseColor("#808080"))
            aboutMe_btn.typeface = regular

            childFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, myFriendsFragment)
                commit()
            }
        }

        aboutMe_btn.setOnClickListener{
            aboutMe_btn.setTextColor(Color.parseColor("#000000"))
            aboutMe_btn.typeface = semiBold

            myBadges_btn.setTextColor(Color.parseColor("#808080"))
            myBadges_btn.typeface = regular
            myCourses_btn.setTextColor(Color.parseColor("#808080"))
            myCourses_btn.typeface = regular
            friends_btn.setTextColor(Color.parseColor("#808080"))
            friends_btn.typeface = regular

            childFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, aboutMeFragment)
                commit()
            }
        }
    }



}