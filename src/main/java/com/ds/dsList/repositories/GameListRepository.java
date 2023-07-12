package com.ds.dsList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ds.dsList.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
