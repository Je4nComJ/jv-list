package com.gomesdevelopers.jvlist.dto;

import com.gomesdevelopers.jvlist.entities.GameList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class GameListDTO {
	
	private Long id;
	private String name;
	
	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();
	}
}
