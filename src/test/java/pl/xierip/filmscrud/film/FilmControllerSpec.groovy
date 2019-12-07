package pl.xierip.filmscrud.film

import pl.xierip.filmscrud.base.IntegrationSpec

class FilmControllerSpec extends IntegrationSpec {

  def "create new film"() {
    given: "I have new film to add"
    when: "I post to endpoint"
    then: "Request return http code created"
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