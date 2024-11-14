package com.gomesdevelopers.jvlist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gomesdevelopers.jvlist.dto.GameDTO;
import com.gomesdevelopers.jvlist.dto.GameMinDTO;
import com.gomesdevelopers.jvlist.entities.Game;
import com.gomesdevelopers.jvlist.projections.GameMinProjection;
import com.gomesdevelopers.jvlist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = repository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).collect(Collectors.toList());		
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = repository.findById(id).get();
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId){
		List<GameMinProjection> result = repository.searchByList(listId);
		return result.stream().map(x -> new GameMinDTO(x)).collect(Collectors.toList());		
	}
	
}
