package com.gomesdevelopers.jvlist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gomesdevelopers.jvlist.dto.GameDTO;
import com.gomesdevelopers.jvlist.dto.GameMinDTO;
import com.gomesdevelopers.jvlist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	@Autowired
	private GameService service;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<GameDTO> findById(@PathVariable Long id){
		GameDTO result = service.findById(id);
		return ResponseEntity.ok(result);
	}
	
	
}
