package com.example.movieapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.movieapplication.databinding.FragmentMainBinding

class MainFragment : Fragment(){
    private lateinit var binding: FragmentMainBinding
    private lateinit var adapter: MovieAdapter
    private var listMovie =  arrayListOf<MovieModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        adapter = MovieAdapter(listMovie, onClick = {model ->

            findNavController().navigate(
                MainFragmentDirections.actionMainFragmentToDetailFragment(model))
        })
        binding.rvMovies.adapter = adapter
    }
    fun loadData() {
        listMovie.add(
            MovieModel(
            img = "https://m.media-amazon.com/images/M/MV5BNGEwYjgwOGQtYjg5ZS00Njc1LTk2ZGEtM2QwZWQ2NjdhZTE5XkEyXkFqcGc@._V1_.jpg",
            name = "The Godfather" ,
            desc = "1972  2h 55m",
            info = "Crime/Drama"
        ),)
        listMovie.add(
            MovieModel(
                img = "https://m.media-amazon.com/images/M/MV5BNjM1ZDQxYWUtMzQyZS00MTE1LWJmZGYtNGUyNTdlYjM3ZmVmXkEyXkFqcGc@._V1_FMjpg_UX1000_.jpg",
                name = "The Godfather" ,
                desc = "1993  3h 15m",
                info = "Crime/Drama"
            ),)
        listMovie.add(
            MovieModel(
                img = "https://m.media-amazon.com/images/M/MV5BYzdjMDAxZGItMjI2My00ODA1LTlkNzItOWFjMDU5ZDJlYWY3XkEyXkFqcGc@._V1_FMjpg_UX1000_.jpg",
                name = "Interstellar",
                desc = "2014  2h 49m",
                info = "Sci-Fi/Drama/Adventure"
            ),)
        listMovie.add(
            MovieModel(
                img = "https://m.media-amazon.com/images/M/MV5BN2E5NzI2ZGMtY2VjNi00YTRjLWI1MDUtZGY5OWU1MWJjZjRjXkEyXkFqcGc@._V1_.jpg",
                name = "Goodfellas",
                desc = "1990  2h 16m",
                info = "Crime/Biography/Drama"
            ),)
        listMovie.add(
            MovieModel(
                img = "https://m.media-amazon.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@._V1_.jpg",
                name = "Inception",
                desc = "2010  2h 28m",
                info = "Sci-Fi/Action/Thriller"
            ),)
        listMovie.add(
            MovieModel(
                img = "https://m.media-amazon.com/images/M/MV5BNGEwYjgwOGQtYjg5ZS00Njc1LTk2ZGEtM2QwZWQ2NjdhZTE5XkEyXkFqcGc@._V1_.jpg",
                name = "The Godfather",
                desc = "1972  2h 55m",
                info =  "Crime/Drama"
            ),)
        listMovie.add(
            MovieModel(
                img = "https://m.media-amazon.com/images/M/MV5BNjM1ZDQxYWUtMzQyZS00MTE1LWJmZGYtNGUyNTdlYjM3ZmVmXkEyXkFqcGc@._V1_FMjpg_UX1000_.jpg",
                name = "Schindler's List ",
                desc = "1993  3h 15m",
                info = "Biogrgaphy/Drama/History"
            ),)
        listMovie.add(
            MovieModel(
                img = "https://m.media-amazon.com/images/M/MV5BYzdjMDAxZGItMjI2My00ODA1LTlkNzItOWFjMDU5ZDJlYWY3XkEyXkFqcGc@._V1_FMjpg_UX1000_.jpg",
                name = "Interstellar",
                desc = "2014  2h 49m",
                info = "Sci-Fi/Drama/Adventure"

            ),)
        listMovie.add(
            MovieModel(
                img = "https://m.media-amazon.com/images/M/MV5BN2E5NzI2ZGMtY2VjNi00YTRjLWI1MDUtZGY5OWU1MWJjZjRjXkEyXkFqcGc@._V1_.jpg",
                name = "Goodfellas",
                desc = "1990  2h 16m",
                info = "Crime/Biography/Drama"
            ),)
        listMovie.add(
            MovieModel(
                img = "https://m.media-amazon.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@._V1_.jpg",
                name = "Inception",
                desc = "2010  2h 28m",
                info = "Sci-Fi/Action/Thriller"
            ),)
    }
}