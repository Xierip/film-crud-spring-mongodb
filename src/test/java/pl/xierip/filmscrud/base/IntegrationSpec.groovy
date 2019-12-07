package pl.xierip.filmscrud.base

import com.fasterxml.jackson.databind.ObjectMapper
import groovy.transform.TypeChecked
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.test.context.ActiveProfiles
import org.springframework.web.context.WebApplicationContext
import pl.xierip.filmscrud.infrastructure.constant.MongoCollections
import spock.lang.Specification

@TypeChecked
@SpringBootTest
@ActiveProfiles("test")
abstract class IntegrationSpec extends Specification {

  @Autowired
  protected WebApplicationContext webApplicationContext
  @Autowired
  protected ObjectMapper objectMapper
  @Autowired
  protected MongoTemplate mongoTemplate

  void setup() {

  }

  void cleanup() {
    mongoTemplate.dropCollection(MongoCollections.FILMS)
  }

  String objectToJson(Object object) {
    return objectMapper.writeValueAsString(object)
  }


}
