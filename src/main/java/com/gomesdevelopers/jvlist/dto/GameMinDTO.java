package com.gomesdevelopers.jvlist.dto;

import com.gomesdevelopers.jvlist.entities.Game;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class GameMinDTO {
	
	 private Long id;
		
	 private String title;
	 

	 private Integer year;
	 
	
	 private String imgUrl;
	 

	 private String shortDescription;
	 
	 
	 public GameMinDTO(Game entity) {
		 id = entity.getId();
		 title = entity.getTitle();
		 year = entity.getYear();
		 imgUrl = entity.getImgUrl();
		 shortDescription = entity.getShortDescription();
	 }
	 	
}
