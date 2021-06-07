package com.graphql.api.com.demo.dao;

import com.graphql.api.com.demo.model.DataMock;
import com.graphql.api.com.demo.model.Movie;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MovieDAO {

  private List<Movie> movies;

  public MovieDAO() {
    this.movies = new DataMock().getMovies();
  }

  public Optional<Movie> getMovie(String movieId) {
    return movies.stream().filter(movie -> movieId.equals(movie.getId())).findFirst();
  }

  public List<Movie> getMovies() {
    return movies;
  }

  public Integer getMoviesCount() {
    return movies.size();
  }
}
