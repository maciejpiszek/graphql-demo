package com.graphql.api.com.demo.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
@Data
public class DataMock {

  private List<Movie> movies;
  private List<Character> characters;
  private List<Actor> actors;

  public DataMock() {
    var movie1 =  Movie.builder().id("1").title("Vabank").build();
    var movie2 =  Movie.builder().id("2").title("Alternatywy 4").build();
    var movie3 =  Movie.builder().id("3").title("Czterej pancerni i pies").build();

    var character1 = Character.builder().id("1").name("Janek").status("Czołgista").movie(movie3).build();
    var character2 = Character.builder().id("2").name("Kwinto").status("Muzyk").movie(movie1).build();
    var character3 = Character.builder().id("3").name("Anioł").status("Gospodarz domu").movie(movie2).build();
    var character4 = Character.builder().id("4").name("Jan Winnicki").status("Dygnitarz").movie(movie2).build();

    var actor1 = Actor.builder().id("1").name("Roman").surname("Wilhelmi").movies(Collections.singletonList(movie2)).build();
    var actor2 = Actor.builder().id("2").name("Jan").surname("Machulski").movies(Collections.singletonList(movie1)).build();
    var actor3 = Actor.builder().id("3").name("Janusz").surname("Gajos").movies(Arrays.asList(movie2, movie3)).build();

    movie1.setActors(Collections.singletonList(actor2));
    movie1.setCharacters(Collections.singletonList(character2));

    movie2.setActors(Arrays.asList(actor1, actor3));
    movie2.setCharacters(Arrays.asList(character3, character4));

    movie3.setActors(Collections.singletonList(actor3));
    movie3.setCharacters(Collections.singletonList(character1));

    this.movies = Arrays.asList(movie1, movie2, movie3);
    this.characters = Arrays.asList(character1, character2, character3, character4);
    this.actors = Arrays.asList(actor1, actor2, actor3);
  }
}
