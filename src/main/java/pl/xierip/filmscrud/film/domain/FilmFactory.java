package pl.xierip.filmscrud.film.domain;

import pl.xierip.filmscrud.film.domain.dto.FilmCreationDto;

class FilmFactory {
  Film creation(FilmCreationDto filmCreationDto){
    return Film.builder().description(filmCreationDto.getDescription()).name(filmCreationDto.getName()).build();
  }
}
