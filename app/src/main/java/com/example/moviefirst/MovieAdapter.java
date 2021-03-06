package com.example.moviefirst;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.moviefirst.api.MovieApp;
import com.example.moviefirst.model.Movie;


import java.util.ArrayList;
import java.util.List;



public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    List<Movie> search;

    public class MovieViewHolder extends RecyclerView.ViewHolder {
        ImageView poster;
        TextView movieTitle;

        public MovieViewHolder(View itemView) {
            super(itemView);
            poster = (ImageView) itemView.findViewById(R.id.poster);
            movieTitle =  (TextView)itemView.findViewById(R.id.movie_title);
        }
    }

    public MovieAdapter(List<Movie> search) {
        this.search = search;
    }

    public MovieAdapter() {
    }

    public List<Movie> getSearch() {
        return search;
    }

    public void setSearch(List<Movie> search) {

        this.search = search;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_item, parent, false);

        return new MovieViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        Movie item = search.get(position);
        holder.movieTitle.setText(item.getTitle());
        Glide.with(holder.poster.getContext()).load(item.getPoster()).into(holder.poster);
    }

    @Override
    public int getItemCount() {
        return search.size();
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}
