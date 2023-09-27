package com.example.pgrkam.utils

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pgrkam.databinding.ActivityMainFragmentHomeListItemBinding


class PostsViewHolder (
    private val binding: ActivityMainFragmentHomeListItemBinding
): RecyclerView.ViewHolder(binding.root) {
    fun bind() {

    }
}

class PostsAdapter(
    private val context: Context
): RecyclerView.Adapter<PostsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsViewHolder {
        val binding = ActivityMainFragmentHomeListItemBinding
            .inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return PostsViewHolder(binding)
    }

    override fun getItemCount() = 0

    override fun onBindViewHolder(holder: PostsViewHolder, position: Int) {
        holder.bind()
    }
}
