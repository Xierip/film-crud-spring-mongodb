package pl.xierip.filmscrud.film.domain;

import org.bson.types.ObjectId;
import pl.xierip.filmscrud.film.domain.dto.FilmCreationDto;
import pl.xierip.filmscrud.film.domain.dto.FilmDataUpdateDto;

class FilmService {

  private FilmRepository filmRepository;
  private FilmFactory    filmFactory;

  public FilmService(FilmRepository filmRepository, FilmFactory filmFactory) {
    this.filmRepository = filmRepository;
    this.filmFactory = filmFactory;
  }

  public Film updateData(ObjectId id, FilmDataUpdateDto filmDataUpdateDto) {
    Film film = filmRepository.findByIdOrThrow(id);
    film.setName(filmDataUpdateDto.getName());
    film.setDescription(film.getDescription());
    return filmRepository.save(film);
  }

  public Film remove(ObjectId id) {
    Film film = filmRepository.findByIdOrThrow(id);
    filmRepository.delete(film);
    return film;

  }

  public Film add(FilmCreationDto filmCreationDto) {
    return filmRepository.save(filmFactory.creation(filmCreationDto));
  }
}
