package pl.xierip.filmscrud.film.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import pl.xierip.filmscrud.infrastructure.constant.MongoCollections;

@Document(MongoCollections.FILMS)
@Builder
@Getter
@Setter
class Film {

  @Id
  private ObjectId id;
  private String   name;
  private String   description;

}
