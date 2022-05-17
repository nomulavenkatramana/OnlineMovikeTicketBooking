package net.javaguides.springboot.controller;
import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Getseatsbooked;
import net.javaguides.springboot.repository.GetseatsbookedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class GetseatsbookedController {

    @Autowired
    private GetseatsbookedRepository getseatsbookedRepository;

    //get all shows rest api
    @GetMapping("/getseatsbooked/{moviename}")
    public ResponseEntity<Getseatsbooked> getSeatsbooked(@PathVariable String moviename ) {
        System.out.println(moviename);
        Getseatsbooked getseatsbooked = getseatsbookedRepository.findById(moviename)
                .orElseThrow(() -> new ResourceNotFoundException("user not exist with password :" + moviename));
        return ResponseEntity.ok(getseatsbooked);
    }



}
