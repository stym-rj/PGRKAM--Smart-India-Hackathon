package com.example.pgrkam.mainActivityFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pgrkam.R
import com.example.pgrkam.databinding.ActivityMainFragmentProfileBinding

class FragmentProfile : Fragment() {
    private val binding by lazy {
        ActivityMainFragmentProfileBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = binding.root
        // Inflate the layout for this fragment
        return view
    }

}