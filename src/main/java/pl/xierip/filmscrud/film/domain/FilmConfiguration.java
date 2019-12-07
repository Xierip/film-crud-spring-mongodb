package pl.xierip.filmscrud.film.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class FilmConfiguration {

  @Bean
  FilmFacade filmFacade(FilmRepository filmRepository) {
    FilmFactory filmFactory = new FilmFactory();
    FilmService filmService = new FilmService(filmRepository, filmFactory);
    return new FilmFacade(filmRepository, filmService);
  }
}
