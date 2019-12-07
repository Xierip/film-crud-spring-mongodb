package pl.xierip.filmscrud.film.domain.exceptions;

public final class FilmNotFoundException extends RuntimeException {

  public FilmNotFoundException() {
    super("Cannot find film");
  }
}
