package com.example.moviefirst;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       MoviesListFragment mFragment = new MoviesListFragment();
       FragmentManager fragmentManager =  getFragmentManager();
        fragmentManager.beginTransaction().add(R.id.fragmentContaner, mFragment)
               .addToBackStack("myStack")
               .commit();


   }
}
