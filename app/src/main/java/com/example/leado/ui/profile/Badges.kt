package com.example.leado.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.leado.R
import com.example.leado.adapters.BadgesAdaptor
import com.example.leado.models.Badge
import kotlinx.android.synthetic.main.fragment_badges.*
import kotlinx.android.synthetic.main.fragment_badges.view.*

class Badges : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_badges, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)

        var badges = ArrayList<Badge>()
        badges.add(Badge(R.drawable.ic_police_badge, "Police Badge", "Weewaaweewaaa"))
        badges.add(Badge(R.drawable.ic_crown1, "King", "God save the kinggg"))
        badges.add(Badge(R.drawable.ic_crown2, "King2", "God save the kinggg2"))
        badges.add(Badge(R.drawable.ic_medal, "Medal", "Medal of Honor"))
        badges.add(Badge(R.drawable.ic_police_badge, "Police Badge", "Weewaaweewaaa"))
        badges.add(Badge(R.drawable.ic_crown1, "King", "God save the kinggg"))
        badges.add(Badge(R.drawable.ic_crown2, "King2", "God save the kinggg2"))
        badges.add(Badge(R.drawable.ic_medal, "Medal", "Medal of Honor"))
        badges.add(Badge(R.drawable.ic_police_badge, "Police Badge", "Weewaaweewaaa"))
        badges.add(Badge(R.drawable.ic_crown1, "King", "God save the kinggg"))
        badges.add(Badge(R.drawable.ic_crown2, "King2", "God save the kinggg2"))
        badges.add(Badge(R.drawable.ic_medal, "Medal", "Medal of Honor"))
        badges_rv.adapter = BadgesAdaptor(badges)
    }
}