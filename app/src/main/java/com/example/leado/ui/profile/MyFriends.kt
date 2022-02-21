package com.example.leado.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.leado.R
import com.example.leado.adapters.FriendsAdaptor
import com.example.leado.adapters.PeoplesAdapter
import com.example.leado.models.People
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriends : Fragment()
{

    private val friends = ArrayList<People>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        friends.add(People("Pep",10000.0,R.drawable.pep))
        friends.add(People("Kordy",20000.0,R.drawable.kordy))
        friends.add(People("Aborayes",30000.0,R.drawable.aboraya))
        friends.add(People("Eiso",40000.0,R.drawable.assoum))
        friends.add(People("Omda",50000.0,R.drawable.omd))
        friends.add(People("Merwaan",60000.0,R.drawable.pp))
        friends.add(People("Pep",10000.0,R.drawable.pp))
        friends.add(People("Kordy",20000.0,R.drawable.pp))
        friends.add(People("Aborayes",30000.0,R.drawable.pp))
        friends.add(People("Eiso",40000.0,R.drawable.pp))
        friends.add(People("Omda",50000.0,R.drawable.pp))
        friends.add(People("Merwaan",60000.0,R.drawable.pp))

        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        my_friends.adapter = FriendsAdaptor(friends)
    }


}