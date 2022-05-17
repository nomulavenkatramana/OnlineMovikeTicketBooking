package net.javaguides.springboot.controller;
import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Getmoviebytheatername;
import net.javaguides.springboot.model.Getshowbytheateridandmovieid;
import net.javaguides.springboot.model.Show;
import net.javaguides.springboot.repository.GetshowbytheateridandmovieidRepository;
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
public class GetshowbytheateridandmovieidController {

    @Autowired
    private GetshowbytheateridandmovieidRepository getshowbytheateridandmovieidRepository;

    //get all shows rest api
    @GetMapping("/showbytheateridandmovieid/{theaterid}")
    public ResponseEntity<Getshowbytheateridandmovieid> getShowtimebytheaternameandmoviename(@PathVariable String theaterid ) {
        System.out.println(theaterid);
        Getshowbytheateridandmovieid getshowbytheateridandmovieid = getshowbytheateridandmovieidRepository.findById(theaterid)
                .orElseThrow(() -> new ResourceNotFoundException("user not exist with password :" + theaterid));
        return ResponseEntity.ok(getshowbytheateridandmovieid);
    }



}
