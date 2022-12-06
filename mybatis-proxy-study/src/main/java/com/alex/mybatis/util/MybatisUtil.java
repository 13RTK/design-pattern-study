package com.alex.mybatis.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisUtil {
    static volatile SqlSessionFactory sqlSessionFactory;

    private MybatisUtil() {
    }

    private static void initSqlSessionFactory(InputStream configStream) {
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(configStream);
    }

    public static SqlSession getSqlSession(InputStream configStream, boolean isAutoCommit) {
        if (sqlSessionFactory == null) {
            synchronized(MybatisUtil.class) {
                if (sqlSessionFactory == null) {
                    initSqlSessionFactory(configStream);
                }
            }
        }

        return sqlSessionFactory.openSession(isAutoCommit);
    }
}
