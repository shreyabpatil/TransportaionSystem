package com.shreyaguides.transportationsystem.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shreyaguides.transportationsystem.model.Trailer;
import com.shreyaguides.transportationsystem.service.TrailerService;

@RestController
public class TrailerController {
	
    @Autowired
	private TrailerService trailerService;
    
    @PostMapping("/trailer")
    public ResponseEntity<String> createTrailer(@RequestBody Trailer trailer){
    	String status = trailerService.upsert(trailer);
    	return new ResponseEntity<>(status, HttpStatus.CREATED);
    }
    
    @GetMapping("/trailer/{tid}")
    public ResponseEntity<Trailer> getTrailer(@PathVariable Integer tid){
    	Trailer trailer = trailerService.getById(tid);
    	return new ResponseEntity<>(trailer, HttpStatus.OK);
    }
    
    @GetMapping("/trailers")
    public ResponseEntity<List<Trailer>> getAllTrailers(){
    	List<Trailer> allTrailers = trailerService.getAllTrailers();
    	return new ResponseEntity<>(allTrailers, HttpStatus.OK);
    }
    
    @PutMapping("/trailer")
    public ResponseEntity<String> updateTrailer(@RequestBody Trailer trailer){
    	String status = trailerService.upsert(trailer);
    	return new ResponseEntity<>(status, HttpStatus.OK);
    }
    
    @DeleteMapping("/trailer/{tid}")
    public ResponseEntity<String> deleteTrailer(@PathVariable Integer tid){
    	String status = trailerService.deleteById(tid);
    	return new ResponseEntity<>(status, HttpStatus.OK);
    }
}
