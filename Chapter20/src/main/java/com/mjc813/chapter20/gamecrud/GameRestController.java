package com.mjc813.chapter20.gamecrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameRestController {
    @Autowired
    private GameService gameService;

    @PostMapping("/api/insert-data")
    public void insertData(@RequestBody GameDto gameDto) {
        System.out.println("insertData" + gameDto.toString());
        this.gameService.insertData(gameDto);
    }
}
