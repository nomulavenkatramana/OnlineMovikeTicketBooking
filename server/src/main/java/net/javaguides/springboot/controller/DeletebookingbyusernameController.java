package net.javaguides.springboot.controller;
import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Booking;
import net.javaguides.springboot.model.Deletebookingbyusername;
import net.javaguides.springboot.model.Movie;
import net.javaguides.springboot.model.Show;
import net.javaguides.springboot.repository.BookingRepository;
import net.javaguides.springboot.repository.DeletebookingbyusernameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class DeletebookingbyusernameController {

    @Autowired
    private DeletebookingbyusernameRepository deletebookingbyusernameRepository;


    // delete show rest api
    @DeleteMapping("/deletebookingbyusername/{username}")
    public ResponseEntity<Map<String, Boolean>> deleteBooking(@PathVariable String username){
        Deletebookingbyusername deletebookingbyusername = deletebookingbyusernameRepository.findById(username)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + username));

        deletebookingbyusernameRepository.delete(deletebookingbyusername);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }




}
