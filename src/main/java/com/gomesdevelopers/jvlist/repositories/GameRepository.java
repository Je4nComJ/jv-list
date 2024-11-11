package com.gomesdevelopers.jvlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gomesdevelopers.jvlist.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{

}
