package com.example.callapiexample3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MyAdapter(private val context: Context, private val movieList: List<MyDataItem>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(property: MyDataItem) {
            var imgMovie: ImageView = itemView.findViewById(R.id.img_movie)
            var tvNameMovies: TextView = itemView.findViewById(R.id.tvNameMovie)
            var tvCategory: TextView = itemView.findViewById(R.id.tvCategory)
            var tvFirstAppearance: TextView = itemView.findViewById(R.id.tvFirstAppearance)
            var tvPublisher: TextView = itemView.findViewById(R.id.tvPublisher)
            var tvBio: TextView = itemView.findViewById(R.id.tvBio)

            Glide.with(itemView.context).load(property.imageurl).into(imgMovie)
            tvNameMovies.text = property.name
            tvCategory.text = property.createdby
            tvFirstAppearance.text = property.firstappearance
            tvPublisher.text = property.publisher
            tvBio.text = property.bio
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.item_movie, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(movieList[position])
    }

    override fun getItemCount(): Int {
        return movieList.size
    }
}