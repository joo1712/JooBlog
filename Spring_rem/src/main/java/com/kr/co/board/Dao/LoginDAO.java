package com.kr.co.board.Dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDAO {

		@Autowired
		private SqlSessionTemplate sql;

		public void selectUserLogin(String userId) {
			sql.selectOne("board.selectUserLogin",userId);
		}
	
		
}
