package com.graphql.api.com.demo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Character {
  private String id;
  private String name;
  private String status;
  private Movie movie;
}
