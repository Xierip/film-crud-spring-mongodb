package pl.xierip.filmscrud.film.domain;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import pl.xierip.filmscrud.film.domain.exceptions.FilmNotFoundException;

interface FilmRepository extends MongoRepository<Film, ObjectId> {

  default Film findByIdOrThrow(ObjectId id) {
    return this.findById(id).orElseThrow(FilmNotFoundException::new);
  }
}
