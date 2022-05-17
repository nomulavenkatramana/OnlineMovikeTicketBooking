package net.javaguides.springboot.controller;
import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Show;
import net.javaguides.springboot.repository.showRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class ShowController {

    @Autowired
    private showRepository showRepository;

    //get all shows rest api
    @GetMapping("/show")
    public List<Show> getAllShow(){
        return showRepository.findAll();
    }

    //create show rest api
    @PostMapping("/show")
    public Show addShow(@RequestBody Show show) {
        return showRepository.save(show);
    }


    @PutMapping("/show/{id}")
    public ResponseEntity<Show> updateShow(@PathVariable Long id, @RequestBody Show showDetails){
        System.out.println(id);
        Show show = showRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

        show.setTheaterId(showDetails.getTheaterId());
        show.setMovieId(showDetails.getMovieId());
        show.setShowTime(showDetails.getShowTime());
        show.setSeatsAvailable(showDetails.getSeatsAvailable());

        Show updatedShow = showRepository.save(show);
        return ResponseEntity.ok(updatedShow);
    }


    // delete show rest api
    @DeleteMapping("/show/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteShow(@PathVariable Long id){
        Show show = showRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

        showRepository.delete(show);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }


}
