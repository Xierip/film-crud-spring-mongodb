package pl.xierip.filmscrud.film

import org.springframework.test.web.servlet.ResultActions
import pl.xierip.filmscrud.base.IntegrationSpec
import pl.xierip.filmscrud.film.domain.dto.FilmCreationDto
import pl.xierip.filmscrud.infrastructure.constant.ApiLayers

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

class FilmControllerSpec extends IntegrationSpec {

  def "create new film"() {
    given: "I have new film to add"
      FilmCreationDto filmCreationDto = new FilmCreationDto("Test name", "Test desc")
    when: "I post to endpoint"
      ResultActions request = mockMvc.perform(post(ApiLayers.FILMS, filmCreationDto))
    then: "Request return http code created"
      request.andExpect(status().isOk())

  }

  def "show film"() {
    given: "I have id of film"
    when: "I post to endpoint"
    then: "Request return http code created"
  }

  def "show films"() {
    given: "I have id of film"
    when: "I post to endpoint"
    then: "Request return http code created"
  }

  def "update existing film by id"() {
    given: "I have new film data"
    when: "I put to endpoint with id"
    then: "Request return http code ok"
  }

  def "delete existing film by id"() {
    given: "I have id of film"
    when: "I delete to endpoint with id"
    then: "Request return http code nocontent"
  }
}