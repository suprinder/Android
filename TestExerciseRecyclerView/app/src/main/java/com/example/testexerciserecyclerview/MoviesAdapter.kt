package com.example.testexerciserecyclerview

import Model.Movie
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*
import android.util.Log

class MoviesAdapter(private val movies: List<Movie>): RecyclerView.Adapter<MoviesAdapter.ViewHolder>(){

    companion object{
        private val TAG: String = MoviesAdapter::class.java.simpleName
    }

    inner class ViewHolder(listItem: View): RecyclerView.ViewHolder(listItem) {
        val movieItem = listItem.movieTitle

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context: Context = parent.context
        val movieView = LayoutInflater.from(context).inflate(R.layout.list_item,parent, false)
        Log.i(TAG,"onCreateViewHolder")
        return ViewHolder(movieView)
    }

    override fun getItemCount(): Int {
        Log.i(TAG,"getItemCount")
        return movies.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = movies.get(position)
        holder.movieItem.text = movie.name
        Log.i(TAG,"onBindViewHolder")
    }

}