package com.java1234.util;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class SqlSessionFactoryUtil {
	private static SqlSessionFactory sqlSessionFactory=null;
	
	private SqlSessionFactory getSqlSessionFactory() {
		InputStream inputStream;
		try {
			inputStream=Resources.getResourceAsStream("mybatis-config.xml");
			sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sqlSessionFactory;
	}
	
	public SqlSession getSqlSession(){
		SqlSession sqlSession=getSqlSessionFactory().openSession();
		return sqlSession;
	}
}
