package pl.xierip.filmscrud.film;

import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.xierip.filmscrud.film.domain.dto.FilmDto;
import pl.xierip.filmscrud.film.domain.dto.FilmDataUpdateDto;
import pl.xierip.filmscrud.infrastructure.constant.ApiLayers;

@RestController
@RequestMapping(ApiLayers.FILMS)
class FilmController {

  @PostMapping
  FilmDto createFilm() {
    return null;
  }

  @GetMapping
  Page<FilmDto> fetchFilms() {
    return null;
  }

  @GetMapping("{id}")
  Page<FilmDto> fetchFilmById(@PathVariable ObjectId id) {
    return null;
  }

  @PutMapping("{id}")
  Page<FilmDto> updateFilmData(FilmDataUpdateDto filmDto) {
    return null;
  }

  @DeleteMapping("{id}")
  Page<FilmDto> deleteFilm(@PathVariable ObjectId id) {
    return null;
  }


}
