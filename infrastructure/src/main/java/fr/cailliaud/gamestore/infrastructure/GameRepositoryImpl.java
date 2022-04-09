package fr.cailliaud.gamestore.infrastructure;

import fr.cailliaud.gamestore.domain.Game;
import fr.cailliaud.gamestore.domain.GameRepository;

import java.util.Optional;

public class GameRepositoryImpl implements GameRepository {
    @Override
    public Optional<Game> findByName(String name) {
        return Optional.empty();
    }
}
