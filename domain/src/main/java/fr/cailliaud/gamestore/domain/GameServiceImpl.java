package fr.cailliaud.gamestore.domain;

public class GameServiceImpl implements GameService {

  private final GameRepository gameRepository;

  public GameServiceImpl(GameRepository gameRepository) {
    this.gameRepository = gameRepository;
  }

  @Override
  public Game getGame(String name) {
    return gameRepository.findByName(name).orElseThrow();
  }
}
