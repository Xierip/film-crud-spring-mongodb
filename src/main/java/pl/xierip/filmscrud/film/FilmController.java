package pl.xierip.filmscrud.film;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.xierip.filmscrud.film.domain.FilmFacade;
import pl.xierip.filmscrud.film.domain.dto.FilmCreationDto;
import pl.xierip.filmscrud.film.domain.dto.FilmDto;
import pl.xierip.filmscrud.film.domain.dto.FilmDataUpdateDto;
import pl.xierip.filmscrud.infrastructure.constant.ApiLayers;

@RestController
@RequestMapping(ApiLayers.FILMS)
class FilmController {

  private FilmFacade filmFacade;

  @PostMapping
  ResponseEntity<FilmDto> createFilm(FilmCreationDto filmCreationDto) {
    return ResponseEntity.ok(filmFacade.add(filmCreationDto));
  }

  @GetMapping
  ResponseEntity<Page<FilmDto>> fetchFilms(PageRequest pageRequest) {
    return ResponseEntity.ok(filmFacade.showAll(pageRequest));
  }

  @GetMapping("{id}")
  ResponseEntity<FilmDto> fetchFilmById(@PathVariable @Valid @NotNull ObjectId id) {
    return ResponseEntity.ok(filmFacade.show(id));
  }

  @PutMapping("{id}")
  ResponseEntity<Page<FilmDto>> updateFilmData(@RequestBody @Valid @NotNull FilmDataUpdateDto filmDataUpdateDto) {
    return ResponseEntity.ok(filmFacade.update(filmDataUpdateDto));
  }

  @DeleteMapping("{id}")
  ResponseEntity< Page<FilmDto>> deleteFilm(@PathVariable ObjectId id) {
    return ResponseEntity.ok(filmFacade.remove(id));
  }


}
