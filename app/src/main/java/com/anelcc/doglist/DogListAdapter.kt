package com.anelcc.doglist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.anelcc.doglist.databinding.ItemDogBinding
import com.squareup.picasso.Picasso

class DogListAdapter(val images: List<String>) : RecyclerView.Adapter<DogListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_dog, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = images[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = images.size

    class ViewHolder (view: View): RecyclerView.ViewHolder(view)  {
        private val binding = ItemDogBinding.bind(view)
        fun bind(image: String) {
            Picasso.get().load(image).into(binding.dogImage)
        }
    }
}