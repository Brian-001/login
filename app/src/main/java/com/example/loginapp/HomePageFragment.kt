package com.example.loginapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.loginapp.databinding.FragmentHomePageBinding



class HomePageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding =DataBindingUtil.inflate<FragmentHomePageBinding>(inflater,R.layout.fragment_home_page,container,false)
           binding.homepagetbtn.setOnClickListener(
                   Navigation.createNavigateOnClickListener(R.id.action_homePageFragment2_to_welcomeFragment2)
           )
        return binding.root
    }



}