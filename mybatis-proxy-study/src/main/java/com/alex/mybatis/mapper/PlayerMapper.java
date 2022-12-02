package com.alex.mybatis.mapper;

import com.alex.mybatis.entity.Player;
import org.apache.ibatis.annotations.Select;

public interface PlayerMapper {
    int insertPlayer();

    Player selectPlayer(Integer id);
}
