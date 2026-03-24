package com.mjc813.chapter20.gamecrud;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IGameMybatis {
    void insertData(GameDto newGame);
}
