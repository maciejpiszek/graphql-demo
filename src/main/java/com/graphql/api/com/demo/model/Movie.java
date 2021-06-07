package com.graphql.api.com.demo.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Movie {
  private String id;
  private String title;
  private List<Character> characters;
  private List<Actor> actors;
}
