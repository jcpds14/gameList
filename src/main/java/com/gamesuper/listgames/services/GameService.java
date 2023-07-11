package com.gamesuper.listgames.services;

import com.gamesuper.listgames.dto.GameMinDTO;
import com.gamesuper.listgames.entities.Game;
import com.gamesuper.listgames.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}