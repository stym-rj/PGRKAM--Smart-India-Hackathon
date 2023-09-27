package com.example.pgrkam.mainActivityFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pgrkam.R
import com.example.pgrkam.databinding.ActivityMainFragmentHomeBinding
import com.example.pgrkam.utils.PostsAdapter

class FragmentHome : Fragment() {

    private val binding by lazy {
        ActivityMainFragmentHomeBinding.inflate(layoutInflater)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = binding.root

        val adapter = PostsAdapter(requireContext())
        binding.rv.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
        binding.rv.adapter = adapter


        return view
    }

}