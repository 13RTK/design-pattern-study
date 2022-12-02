package com.alex.mybatis.mapper;

import com.alex.mybatis.entity.Player;
import com.alex.mybatis.util.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlayerMapperTest {

    InputStream resourceAsStream;

    @Before
    public void loadConfig() throws IOException {
        resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
    }

    @Test
    public void playerInsertTest() {
        SqlSession sqlSession = MybatisUtil.getSqlSession(resourceAsStream);

        PlayerMapper mapper = sqlSession.getMapper(PlayerMapper.class);
        int i = mapper.insertPlayer();
        sqlSession.commit();

        assertTrue(i > 0);
    }

    @Test
    public void playerSelectTest() {
        SqlSession sqlSession = MybatisUtil.getSqlSession(resourceAsStream);

        PlayerMapper mapper = sqlSession.getMapper(PlayerMapper.class);
        Player player = mapper.selectPlayer(1);
        sqlSession.commit();

        assertEquals("Alex-John", player.getAccountName());
    }
}