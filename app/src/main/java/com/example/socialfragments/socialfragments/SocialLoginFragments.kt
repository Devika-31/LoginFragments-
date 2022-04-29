package com.example.socialfragments.socialfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.example.socialfragments.databinding.LoginFragmentsBinding


class SocialLoginFragments : Fragment() {
    lateinit var binding: LoginFragmentsBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
mt("onVIewCreated")
binding= LoginFragmentsBinding.inflate(layoutInflater)

        binding.cardViewfb.setOnClickListener {
            mt("Login with FaceBook")
        }
        binding.cardViewlinkedIn.setOnClickListener {
            mt("Login with LinkedIn")
        }
        binding.cardViewGitHub.setOnClickListener {
            mt("Login with GitHub")
        }
        binding.cardViewBITCODE.setOnClickListener {
            mt("Login with BitCode")
        }


        return binding.root

    }

    private fun mt(text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }


}



