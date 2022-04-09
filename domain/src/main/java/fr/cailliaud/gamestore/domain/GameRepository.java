package fr.cailliaud.gamestore.domain;

import java.util.Optional;

public interface GameRepository {

  Optional<Game> findByName(String name);
}
