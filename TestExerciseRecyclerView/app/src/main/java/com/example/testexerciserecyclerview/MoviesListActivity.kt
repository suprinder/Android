package com.example.testexerciserecyclerview

import Model.Movie
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.movies_list.*

class MoviesListActivity: AppCompatActivity() {

    lateinit var movies: List<Movie>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.movies_list)


        movies = Movie.getMovies(50)
        val adapter = MoviesAdapter(movies)
        moviesRecyclerView.adapter = adapter
        moviesRecyclerView.layoutManager = LinearLayoutManager(this)




    }
}