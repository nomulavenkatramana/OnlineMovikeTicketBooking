package net.javaguides.springboot.controller;
import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Theater;
import net.javaguides.springboot.repository.theaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class TheaterController {

    @Autowired
    private theaterRepository theaterRepository;


    // get all theater rest api
    @GetMapping("/theater")
    public List<Theater> getAllTheater(){
        return theaterRepository.findAll();
    }

    //create theater rest api
    @PostMapping("/theater")
    public Theater addTheater(@RequestBody Theater theater) {
        return theaterRepository.save(theater);
    }


    @PutMapping("/theater/{id}")
    public ResponseEntity<Theater> updateTheater(@PathVariable Long id, @RequestBody Theater theaterDetails){
        System.out.println(id);
        Theater theater = theaterRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

        theater.setTheaterName(theaterDetails.getTheaterName());
        theater.setTheaterLocation(theaterDetails.getTheaterLocation());
        theater.setTotalSeats(theaterDetails.getTotalSeats());
        theater.setTheaterId(theaterDetails.getTheaterId());

        Theater updatedTheater = theaterRepository.save(theater);
        return ResponseEntity.ok(updatedTheater);
    }

    // delete theater rest api
    @DeleteMapping("/theater/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteTheater(@PathVariable Long id){
        Theater theater = theaterRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

        theaterRepository.delete(theater);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }


}
