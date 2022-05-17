package net.javaguides.springboot.controller;
import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Movie;
import net.javaguides.springboot.repository.movieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class MovieController {

    @Autowired
    private movieRepository movieRepository;

    //get all movies rest api
    @GetMapping("/movie")
    public List<Movie> getAllShow(){
        return movieRepository.findAll();
    }


    //create theater rest api
    @PostMapping("/movie")
    public Movie addMovie(@RequestBody Movie movie) {
        return movieRepository.save(movie);
    }

    // delete movie rest api
    @DeleteMapping("/movie/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteShow(@PathVariable Long id){
        Movie movie = movieRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

        movieRepository.delete(movie);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/movie/{id}")
    public ResponseEntity<Movie> updateShow(@PathVariable Long id, @RequestBody Movie movieDetails){
        System.out.println(id);
        Movie movie = movieRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

        movie.setMovieName(movieDetails.getMovieName());
        movie.setMovieLanguage(movieDetails.getMovieLanguage());
        movie.setMovieDuration(movieDetails.getMovieDuration());
        movie.setMovieId(movieDetails.getMovieId());
        movie.setTicketCost(movieDetails.getTicketCost());
        movie.setTheaterName(movieDetails.getTheaterName());
        movie.setStartDate(movieDetails.getStartDate());
        movie.setEndDate(movieDetails.getEndDate());

        Movie updatedMovie = movieRepository.save(movie);
        return ResponseEntity.ok(updatedMovie);
    }


}
