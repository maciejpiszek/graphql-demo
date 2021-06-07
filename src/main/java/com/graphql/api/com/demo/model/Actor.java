package com.graphql.api.com.demo.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Actor {
  private String id;
  private String name;
  private String surname;
  private List<Movie> movies;
}
