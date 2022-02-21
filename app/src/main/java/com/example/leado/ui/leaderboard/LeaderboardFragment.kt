package com.example.leado.ui.leaderboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.leado.R
import com.example.leado.adapters.PeoplesAdapter
import com.example.leado.models.People
import kotlinx.android.synthetic.main.fragment_leaderboard.*


class LeaderboardFragment : Fragment() {

    private lateinit var leaderboardViewModel: LeaderboardViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        leaderboardViewModel =
            ViewModelProviders.of(this).get(LeaderboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_leaderboard, container, false)
        leaderboardViewModel.text.observe(viewLifecycleOwner, Observer {
        })
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fullList = getPeople()

        val firstImg = fullList[0].image
        val secondImg = fullList[1].image
        val thirdImg = fullList[2].image

        this.user_1st_pp.setImageResource(firstImg)
        this.user_2nd_pp.setImageResource(secondImg)
        this.user_3rd_pp.setImageResource(thirdImg)

        fullList.removeAt(0)
        fullList.removeAt(0)
        fullList.removeAt(0)

        leaderboard_recycler.adapter=PeoplesAdapter(fullList)
    }

    private fun getPeople():ArrayList<People>{
        val p:ArrayList<People> = ArrayList()
        p.add(
            People(
                "Aborayes",
                193.222,
                R.drawable.aboraya
            )
        )
        p.add(
            People(
                "Etch",
                191.222,
                R.drawable.etch
            )
        )
        p.add(
            People(
                "Kirdy",
                190.222,
                R.drawable.kordy
            )
        )
        p.add(
            People(
                "Assoum",
                189.222,
                R.drawable.assoum
            )
        )
        p.add(
            People(
                "Omda",
                188.222,
                R.drawable.omd
            )
        )
        p.add(
            People(
                "Zizo",
                187.222,
                R.drawable.zead
            )
        )
        p.add(
            People(
                "Pep",
                150.222,
                R.drawable.pep
            )
        )
        p.add(
            People(
                "Shamosa",
                130.222,
                R.drawable.shams
            )
        )
        return p
    }

}