package com.gomesdevelopers.jvlist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gomesdevelopers.jvlist.dto.GameListDTO;
import com.gomesdevelopers.jvlist.entities.GameList;
import com.gomesdevelopers.jvlist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository repository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = repository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).collect(Collectors.toList());		
	}

	
}
