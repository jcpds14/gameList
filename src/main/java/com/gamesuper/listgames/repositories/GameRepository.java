package com.gamesuper.listgames.repositories;

import com.gamesuper.listgames.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}