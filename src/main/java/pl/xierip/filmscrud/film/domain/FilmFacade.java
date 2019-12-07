package pl.xierip.filmscrud.film.domain;

import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pl.xierip.filmscrud.film.domain.dto.FilmCreationDto;
import pl.xierip.filmscrud.film.domain.dto.FilmDataUpdateDto;
import pl.xierip.filmscrud.film.domain.dto.FilmDto;

public class FilmFacade {

  private FilmRepository filmRepository;
  private FilmService    filmService;

  public FilmFacade(FilmRepository filmRepository, FilmService filmService) {
    this.filmRepository = filmRepository;
    this.filmService = filmService;
  }

  public FilmDto add(FilmCreationDto filmCreationDto) {
    return filmService.add(filmCreationDto).dto();
  }

  public Page<FilmDto> showAll(Pageable pageable) {
    return filmRepository.findAll(pageable).map(Film::dto);
  }

  public FilmDto show(ObjectId id) {
    return filmRepository.findByIdOrThrow(id).dto();
  }

  public FilmDto update(ObjectId id, FilmDataUpdateDto filmDataUpdateDto) {
    return filmService.updateData(id, filmDataUpdateDto).dto();
  }

  public FilmDto remove(ObjectId id) {
    return filmService.remove(id).dto();
  }
}
