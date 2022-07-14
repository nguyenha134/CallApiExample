package com.example.callapiexample3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val context: Context, private val movieList: List<MyDataItem>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgMovie: ImageView
        var tvNameMovies: TextView
        var tvCategory: TextView
        var tvFirstAppearance: TextView
        var tvPublisher: TextView
        var tvBio: TextView

        init {
            imgMovie = itemView.findViewById(R.id.img_movie)
            tvNameMovies = itemView.findViewById(R.id.tvNameMovie)
            tvCategory = itemView.findViewById(R.id.tvCategory)
            tvFirstAppearance = itemView.findViewById(R.id.tvFirstAppearance)
            tvPublisher = itemView.findViewById(R.id.tvPublisher)
            tvBio = itemView.findViewById(R.id.tvBio)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.item_movie, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imgMovie.setImageURI(movieList[position].imageurl.toUri())
        holder.tvNameMovies.text = movieList[position].name
        holder.tvCategory.text = movieList[position].createdby
        holder.tvFirstAppearance.text = movieList[position].firstappearance
        holder.tvPublisher.text = movieList[position].publisher
        holder.tvBio.text = movieList[position].bio
    }

    override fun getItemCount(): Int {
        return movieList.size
    }
}