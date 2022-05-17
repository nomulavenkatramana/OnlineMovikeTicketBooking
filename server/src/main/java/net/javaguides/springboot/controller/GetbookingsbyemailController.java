package net.javaguides.springboot.controller;
import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Getbookingsbyemail;
import net.javaguides.springboot.repository.GetbookingsbyemailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class GetbookingsbyemailController {

    @Autowired
    private GetbookingsbyemailRepository getbookingsbyemailRepository;


    @GetMapping("/getbookingsbyemail/{email}")
    public ResponseEntity<Getbookingsbyemail> getBookingsByEmail(@PathVariable String email) {
        System.out.println(email);
        Getbookingsbyemail getbookingsbyemail = getbookingsbyemailRepository.findById(email)
                .orElseThrow(() -> new ResourceNotFoundException("user not exist with password :" + email));
        return ResponseEntity.ok(getbookingsbyemail);
    }


}
