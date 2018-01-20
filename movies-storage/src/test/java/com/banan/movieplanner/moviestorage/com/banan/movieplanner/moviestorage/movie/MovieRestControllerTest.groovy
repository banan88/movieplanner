package com.banan.movieplanner.moviestorage.com.banan.movieplanner.moviestorage.movie

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import spock.lang.Ignore
import spock.lang.Specification

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MovieRestControllerTest extends Specification {

    @Autowired
    private TestRestTemplate client

//    @Ignore
    def "returns movies by title"() {
        expect:
            Movie[] movies = client.getForObject("/movie", Movie[].class)
            System.out.println(movies)
    }

    @Ignore
    def "deserializes movies"(){
//        expect:
//            ObjectMapper objectMapper = new ObjectMapper();
////            Movie[] pojos = objectMapper.readValue("[{\"title\":\"t2\",\"genres\":[],\"year\":\"2222\"}]", Movie[].class);
//            Movie[] pojos = objectMapper.readValue("[{\"title\":\"t2\",\"genres\":[]}]", Movie[].class);
//            System.out.println(pojos)
    }
}
