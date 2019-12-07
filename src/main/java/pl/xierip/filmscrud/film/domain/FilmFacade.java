package pl.xierip.filmscrud.film.domain;

import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import pl.xierip.filmscrud.film.domain.dto.FilmCreationDto;
import pl.xierip.filmscrud.film.domain.dto.FilmDataUpdateDto;
import pl.xierip.filmscrud.film.domain.dto.FilmDto;

public class FilmFacade {

  public FilmDto add(FilmCreationDto filmCreationDto) {
    return null;
  }

  public Page<FilmDto> showAll(PageRequest pageRequest) {
    return null;
  }

  public FilmDto show(ObjectId id) {
    return null;
  }

  public Page<FilmDto> update(FilmDataUpdateDto filmDataUpdateDto) {
    return null;
  }

  public FilmDto remove(ObjectId id) {
    return null;
  }
}
