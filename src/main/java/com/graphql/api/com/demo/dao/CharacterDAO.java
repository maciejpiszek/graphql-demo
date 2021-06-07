package com.graphql.api.com.demo.dao;

import com.graphql.api.com.demo.model.Character;
import com.graphql.api.com.demo.model.DataMock;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CharacterDAO {

  private List<Character> characters;

  public CharacterDAO() {
    this.characters =  new DataMock().getCharacters();
  }

  public Optional<Character> getCharacter(String characterId) {
    return characters.stream().filter(character -> characterId.equals(character.getId())).findFirst();
  }

  public List<Character> getCharacters() {
    return characters;
  }

  public Integer getCharactersCount() {
    return characters.size();
  }
}
