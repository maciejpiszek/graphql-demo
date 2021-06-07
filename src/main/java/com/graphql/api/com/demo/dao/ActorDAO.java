package com.graphql.api.com.demo.dao;

import com.graphql.api.com.demo.model.Actor;
import com.graphql.api.com.demo.model.DataMock;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ActorDAO {

  private List<Actor> actors;

  public ActorDAO() {
    this.actors =  new DataMock().getActors();
  }

  public Optional<Actor> getActor(String actorId) {
    return actors.stream().filter(actor -> actorId.equals(actor.getId())).findFirst();
  }

  public List<Actor> getActors() {
    return actors;
  }

  public Integer getActorsCount() {
    return actors.size();
  }
}
