package com.gomesdevelopers.jvlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gomesdevelopers.jvlist.entities.GameList;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long>{

}
