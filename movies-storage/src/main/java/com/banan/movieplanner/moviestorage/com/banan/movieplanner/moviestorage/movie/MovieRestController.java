package com.banan.movieplanner.moviestorage.com.banan.movieplanner.moviestorage.movie;


import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//@RepositoryRestResource TODO use this
@RestController
@RequestMapping("/movie")
public class MovieRestController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Movie> getMovies(@RequestParam(required = false) String title) {
        List<Movie> movies = Lists.newArrayList(
                new Movie("t1", new ArrayList<String>(), Year.of(1111)),
                new Movie("t2", new ArrayList<String>(), Year.of(2222)),
                new Movie("t3", new ArrayList<String>(), Year.of(3333)));
        List<Movie> retval = movies;
        if (title != null) {
            retval = movies.stream().filter(m -> m.getTitle().equals(title)).collect(Collectors.toList());
        }
        return retval;
    }
}
