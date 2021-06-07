package com.graphql.api.com.demo.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.api.com.demo.dao.ActorDAO;
import com.graphql.api.com.demo.dao.CharacterDAO;
import com.graphql.api.com.demo.dao.MovieDAO;
import com.graphql.api.com.demo.model.Actor;
import com.graphql.api.com.demo.model.Character;
import com.graphql.api.com.demo.model.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Component
@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {

  private final MovieDAO movieDAO;
  private final CharacterDAO characterDAO;
  private final ActorDAO actorDAO;


  public Movie movie(String movieId) {
    return movieDAO.getMovie(movieId).orElseThrow(() -> new EntityNotFoundException("Movie not found!"));
  }

  public Actor actor(String actorId) {
    return actorDAO.getActor(actorId).orElseThrow(() -> new EntityNotFoundException("Actor not found!"));
  }

  public Character character(String characterId) {
    return characterDAO.getCharacter(characterId).orElseThrow(() -> new EntityNotFoundException("Character not found!"));
  }

  public List<Movie> movies() {
    return movieDAO.getMovies();
  }

  public List<Actor> actors() {
    return actorDAO.getActors();
  }

  public List<Character> characters() {
    return characterDAO.getCharacters();
  }

  public Integer totalMovies() {
    return movieDAO.getMoviesCount();
  }

  public Integer totalActors() {
    return actorDAO.getActorsCount();
  }

  public Integer totalCharacters() {
    return characterDAO.getCharactersCount();
  }
}
