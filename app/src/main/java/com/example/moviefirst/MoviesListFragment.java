package com.example.moviefirst;

import android.app.Activity;
import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.moviefirst.api.MovieApp;
import com.example.moviefirst.model.Movie;
import com.example.moviefirst.model.Search;


import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MoviesListFragment extends Fragment {
    View view;
    EditText editText;
    Button searchButton;
    RecyclerView recyclerViewMovies;
    Activity activity = getActivity();
    List<Movie> search = new ArrayList<>();

    public MoviesListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_movies_list, container, false);
        editText = (EditText) view.findViewById(R.id.edit_txt);
        searchButton = (Button) view.findViewById(R.id.search_btn);
        recyclerViewMovies = (RecyclerView) view.findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity);
        MovieAdapter adapter = new MovieAdapter(search);
        recyclerViewMovies.setLayoutManager(linearLayoutManager);
        recyclerViewMovies.setAdapter(adapter);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MovieApp.getMovieApi().getData(editText.getText().toString()).enqueue(new Callback<Search>() {
                    @Override
                    public void onResponse(Call<Search> call, Response<Search> response) {
                        search.clear();
                        search.addAll(response.body().getSearch());
                        recyclerViewMovies.getAdapter().notifyDataSetChanged();
                    }

                    @Override
                    public void onFailure(Call<Search> call, Throwable t) {

                    }
                });
            }
        });
        return view;

    }




    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }


}
