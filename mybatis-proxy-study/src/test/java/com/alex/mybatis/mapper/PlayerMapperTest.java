package com.alex.mybatis.mapper;

import com.alex.mybatis.entity.Player;
import com.alex.mybatis.util.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
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
        SqlSession sqlSession = MybatisUtil.getSqlSession(resourceAsStream, false);

        PlayerMapper mapper = sqlSession.getMapper(PlayerMapper.class);
        int i = mapper.insertPlayer();
//        sqlSession.commit();

        assertTrue(i > 0);
    }

    @Test
    public void playerSelectTest() throws IOException {
        SqlSession sqlSession = MybatisUtil.getSqlSession(resourceAsStream, false);

        PlayerMapper mapper = sqlSession.getMapper(PlayerMapper.class);
        Player player = mapper.selectPlayer(1);
//        sqlSession.commit();

        assertEquals("Alex", player.getAccountName());
    }

    @Test
    public void playerUpdateTest() {
        SqlSession sqlSession = MybatisUtil.getSqlSession(resourceAsStream, false);

        PlayerMapper mapper = sqlSession.getMapper(PlayerMapper.class);
        int alex = mapper.updatePlayerNameById(1, "Alex");

        assertTrue(alex > 0);
    }

    @Test
    public void remoteDBTest() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory testFactory = new SqlSessionFactoryBuilder().build(resourceAsStream, "test");
        SqlSession sqlSession = testFactory.openSession();

        PlayerMapper mapper = sqlSession.getMapper(PlayerMapper.class);
        Player player = mapper.selectPlayer(1);
        System.out.println(player);

        assertEquals("fswwdza@gmail.com", player.getAccountNumber());
    }
}