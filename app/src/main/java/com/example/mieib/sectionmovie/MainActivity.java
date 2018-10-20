package com.example.mieib.sectionmovie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements ViewContract{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PresenterContract contract = new MainPresenter(this);
        contract.getMovieList();

    }

    @Override
    public void UpdateMovieList(List<Movie> movieList) {

        Toast.makeText(this,movieList.get(0).getName()+" "+movieList.get(1).getName(),Toast.LENGTH_SHORT).show();

    }

    @Override
    public void ShowError() {

    }

    @Override
    public void MoveToNext() {

    }

    @Override
    public boolean checkInternetConnection() {

        boolean status = false;


        return false;
    }
}
