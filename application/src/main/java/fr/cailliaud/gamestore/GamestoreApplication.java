package fr.cailliaud.gamestore;

import fr.cailliaud.gamestore.domain.GameRepository;
import fr.cailliaud.gamestore.domain.GameService;
import fr.cailliaud.gamestore.domain.GameServiceImpl;
import fr.cailliaud.gamestore.infrastructure.GameRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GamestoreApplication {

  public static void main(String[] args) {
    SpringApplication.run(GamestoreApplication.class, args);
  }

  @Bean
  public GameRepository gameRepository() {
    return new GameRepositoryImpl();
  }

  @Bean
  public GameService gameService(GameRepository gameRepository) {
    return new GameServiceImpl(gameRepository);
  }
}
