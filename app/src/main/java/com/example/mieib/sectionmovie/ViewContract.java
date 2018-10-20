package com.example.mieib.sectionmovie;

import java.util.List;

public interface ViewContract {
    public void UpdateMovieList(List<Movie> movieList);
    public void ShowError();
    public void MoveToNext();
    public boolean checkInternetConnection();
}
