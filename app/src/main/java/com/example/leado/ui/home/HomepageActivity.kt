package com.example.leado.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.leado.R
import com.example.leado.ui.leaderboard.LeaderboardFragment
import com.example.leado.ui.profile.ProfileFragmentMain
import com.example.leado.ui.search.SearchFragment
import kotlinx.android.synthetic.main.activity_homepage.*

class HomepageActivity : AppCompatActivity()
{

    private lateinit var homeFragment: HomeFragment
    private lateinit var leaderboardFragment: LeaderboardFragment
    private lateinit var profileFragment: ProfileFragmentMain
    private lateinit var searchFragment: SearchFragment

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        supportActionBar?.hide()

        homeFragment= HomeFragment()
        leaderboardFragment= LeaderboardFragment()
        profileFragment = ProfileFragmentMain()
        searchFragment = SearchFragment()

        nav_view.setOnNavigationItemSelectedListener { item->
            when(item.itemId){
                R.id.navigation_home->{
                    supportFragmentManager.beginTransaction().replace(R.id.nav_host_fragment,homeFragment).commit()
                }
                R.id.navigation_leaderboard->{
                    supportFragmentManager.beginTransaction().replace(R.id.nav_host_fragment,leaderboardFragment).commit()
                }
                R.id.navigation_profile->{
                    supportFragmentManager.beginTransaction().replace(R.id.nav_host_fragment,profileFragment).commit()
                }
                R.id.navigation_search->{
                    supportFragmentManager.beginTransaction().replace(R.id.nav_host_fragment,searchFragment).commit()
                }
            }
            true
        }
    }
}