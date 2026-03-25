package com.mjc813.chapter20.gamecrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    @Autowired
    private IGameMybatis gameMybatis;

    public void insertData(GameDto newGame) {
        this.gameMybatis.insertData(newGame);
    }
    public void updateData(GameDto gameData) {
        this.gameMybatis.updateData(gameData);
    }
}