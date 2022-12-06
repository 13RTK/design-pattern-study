package com.alex.mybatis.mapper;

import com.alex.mybatis.entity.Player;
import org.apache.ibatis.annotations.Param;

public interface PlayerMapper {
    int insertPlayer();

    Player selectPlayer(Integer id);

    int updatePlayerNameById(@Param("id") Integer id, @Param("newName") String newName);
}
