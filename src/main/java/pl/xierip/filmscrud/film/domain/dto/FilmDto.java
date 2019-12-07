package pl.xierip.filmscrud.film.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

@Builder
@Getter
@Setter
public class FilmDto {

  private ObjectId id;
  private String   name;
  private String   description;
}
