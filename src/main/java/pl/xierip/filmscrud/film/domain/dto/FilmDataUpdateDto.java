package pl.xierip.filmscrud.film.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class FilmDataUpdateDto {

  private String        name;
  private String        description;
}
