package com.gomesdevelopers.jvlist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_belonging")
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Belonging {
	
	@EmbeddedId
	@EqualsAndHashCode.Include
	private BelongingPK id = new BelongingPK();
	private Integer position;
	
	public Belonging( Game game, GameList list, Integer position) {
		super();
		id.setGame(game);
		id.setList(list);
		this.position = position;
	}
	
	
}
