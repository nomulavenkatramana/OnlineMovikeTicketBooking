package net.javaguides.springboot.controller;
import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Getmoviebytheatername;
import net.javaguides.springboot.repository.GetmoviebytheaternameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class GetmoviebytheaternameController {

    @Autowired
    private GetmoviebytheaternameRepository getmoviebytheaternameRepository;


    @GetMapping("/getmoviebytheatername/{theatername}")
    public ResponseEntity<Getmoviebytheatername> getMovieByTheaterName(@PathVariable String theatername) {
        System.out.println(theatername);
        Getmoviebytheatername getmoviebytheatername = getmoviebytheaternameRepository.findById(theatername)
                .orElseThrow(() -> new ResourceNotFoundException("user not exist with password :" + theatername));
        return ResponseEntity.ok(getmoviebytheatername);
    }


}
