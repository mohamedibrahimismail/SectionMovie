package com.example.mieib.sectionmovie;

import java.util.ArrayList;
import java.util.List;

public class MainPresenter implements PresenterContract{

    ViewContract viewContract;

    public MainPresenter(ViewContract viewContract){
        this.viewContract=viewContract;
    }


    @Override
    public void getMovieList() {

        ArrayList<Movie> arrayList = new ArrayList<>();
        arrayList.add(new Movie(1,"ahmed"));
        arrayList.add(new Movie(2,"mohamed"));

        viewContract.UpdateMovieList(arrayList);

        
    }
}
