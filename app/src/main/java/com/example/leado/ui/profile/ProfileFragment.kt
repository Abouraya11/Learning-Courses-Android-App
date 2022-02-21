package com.example.leado.ui.profile

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.leado.R


class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_profile_main, container, false)

        val badgesFragment = Badges()
        val myCoursesFragment = MyCourses()
        val myFriendsFragment = MyFriends()
        val aboutMeFragment = AboutMe()

        childFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, badgesFragment)
            commit()
        }

        /*
        myBadges_btn.setOnClickListener {
            myBadges_btn.setTextColor(Color.parseColor("#000000"))
            /*val myCustomFont : Typeface? = ResourcesCompat.getFont(this, R.font.montserrat_semibold)
            myBadges_btn.typeface = myCustomFont
             */

            myCourses_btn.setTextColor(Color.parseColor("#808080"))
            /*val myCustomFont2 : Typeface? = ResourcesCompat.getFont(this, R.font.montserrat_regular)
            myCourses_btn.typeface = myCustomFont2*/
            friends_btn.setTextColor(Color.parseColor("#808080"))
            //friends_btn.typeface = myCustomFont2
            aboutMe_btn.setTextColor(Color.parseColor("#808080"))
           // aboutMe_btn.typeface = myCustomFont2

            childFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, badgesFragment)
                commit()
            }
        }

        myCourses_btn.setOnClickListener{
            myCourses_btn.setTextColor(Color.parseColor("#000000"))
            //val myCustomFont : Typeface? = ResourcesCompat.getFont(this, R.font.montserrat_semibold)
            //myCourses_btn.typeface = myCustomFont

            myBadges_btn.setTextColor(Color.parseColor("#808080"))
            //val myCustomFont2 : Typeface? = ResourcesCompat.getFont(this, R.font.montserrat_regular)
           // myBadges_btn.typeface = myCustomFont2
            friends_btn.setTextColor(Color.parseColor("#808080"))
            //friends_btn.typeface = myCustomFont2
            aboutMe_btn.setTextColor(Color.parseColor("#808080"))
            //aboutMe_btn.typeface = myCustomFont2

            childFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, myCoursesFragment)
                commit()
            }
        }

        friends_btn.setOnClickListener{
            friends_btn.setTextColor(Color.parseColor("#000000"))
            //val myCustomFont : Typeface? = ResourcesCompat.getFont(this, R.font.montserrat_semibold)
            //friends_btn.typeface = myCustomFont

            myBadges_btn.setTextColor(Color.parseColor("#808080"))
            //val myCustomFont2 : Typeface? = ResourcesCompat.getFont(this, R.font.montserrat_regular)
           // myBadges_btn.typeface = myCustomFont2
            myCourses_btn.setTextColor(Color.parseColor("#808080"))
            //myCourses_btn.typeface = myCustomFont2
            aboutMe_btn.setTextColor(Color.parseColor("#808080"))
            //aboutMe_btn.typeface = myCustomFont2

            childFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, myFriendsFragment)
                commit()
            }
        }

        aboutMe_btn.setOnClickListener{
            aboutMe_btn.setTextColor(Color.parseColor("#000000"))
            //val myCustomFont : Typeface? = ResourcesCompat.getFont(this, R.font.montserrat_semibold)
            //aboutMe_btn.typeface = myCustomFont

            myBadges_btn.setTextColor(Color.parseColor("#808080"))
            //val myCustomFont2 : Typeface? = ResourcesCompat.getFont(this, R.font.montserrat_regular)
            //myBadges_btn.typeface = myCustomFont2
            myCourses_btn.setTextColor(Color.parseColor("#808080"))
            //myCourses_btn.typeface = myCustomFont2
            friends_btn.setTextColor(Color.parseColor("#808080"))
            //friends_btn.typeface = myCustomFont2

            childFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, aboutMeFragment)
                commit()
            }
        }
         */
        return root
    }
}