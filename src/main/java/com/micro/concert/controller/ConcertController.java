package com.micro.concert.controller;

import com.micro.concert.entities.Concert;
import com.micro.concert.service.IConcertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/concert")

public class ConcertController {

    @Autowired
    private IConcertService concertService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveClient(@RequestBody Concert concert) {
        concertService.save(concert);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllClient(){
        return ResponseEntity.ok(concertService.findAll());
    }


    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(concertService.findById(id));
    }


    @GetMapping("/search/client/{idConcert}")
    public ResponseEntity<?> findClientByIdConcert(@PathVariable Long idConcert){
        return ResponseEntity.ok(concertService.findClientsByIdConcert(idConcert));

    }
}
