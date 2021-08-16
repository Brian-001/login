package com.example.loginapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.loginapp.databinding.FragmentWelcomeBinding


class welcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       val binding= DataBindingUtil.inflate<FragmentWelcomeBinding>(inflater,R.layout.fragment_welcome,container,false)
        binding.welcomebtn1.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_welcomeFragment2_to_loginFragment2)
        )
        binding.welcomebtn.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_welcomeFragment2_to_createAccountFragment2)
        )
        return binding.root

    }



}