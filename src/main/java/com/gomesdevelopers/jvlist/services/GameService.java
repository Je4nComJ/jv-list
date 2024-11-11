package com.gomesdevelopers.jvlist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gomesdevelopers.jvlist.dto.GameMinDTO;
import com.gomesdevelopers.jvlist.entities.Game;
import com.gomesdevelopers.jvlist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = repository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).collect(Collectors.toList());
		
	}
}
