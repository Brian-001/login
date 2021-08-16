package com.example.loginapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.loginapp.databinding.FragmentCreateAccountBinding
import com.example.loginapp.databinding.FragmentLoginBinding
import com.example.loginapp.databinding.FragmentWelcomeBinding


class CreateAccountFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentCreateAccountBinding>(inflater,R.layout.fragment_create_account,container,false)
        binding.createaccountbtn.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_createAccountFragment2_to_loginFragment22)
        )
        return binding.root
    }


}