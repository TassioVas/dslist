package com.ds.dsList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ds.dsList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
