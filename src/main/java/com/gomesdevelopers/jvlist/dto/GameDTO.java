package com.gomesdevelopers.jvlist.dto;

import org.springframework.beans.BeanUtils;

import com.gomesdevelopers.jvlist.entities.Game;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GameDTO {
	
	 private Long id;	
	 private String title;
	 private Integer year; 
	 private String genre;
	 private Double score;
	 private String platforms;
	 private String imgUrl;
	 private String shortDescription; 
	 private String longDescription;
	 
	 public GameDTO(Game entity) {
		BeanUtils.copyProperties(entity, this);
	 }
	
}
