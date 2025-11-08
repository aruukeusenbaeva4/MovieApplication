package com.example.movieapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.movieapplication.databinding.ItemMovieBinding

class MovieAdapter(val movieList: ArrayList<MovieModel>):
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieViewHolder {
        return MovieViewHolder(ItemMovieBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun onBindViewHolder(
        holder: MovieViewHolder,
        position: Int
    ) {
        holder.onBind(movieList[position])
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    inner class MovieViewHolder(private val binding: ItemMovieBinding):
        RecyclerView.ViewHolder(binding.root){
        fun onBind(movieModel: MovieModel){
            binding.tvName.text = movieModel.name
            binding.tvInfo.text = movieModel.desc
            Glide.with(binding.imgMovies).load(movieModel.img).into(binding.imgMovies)
        }
    }
}