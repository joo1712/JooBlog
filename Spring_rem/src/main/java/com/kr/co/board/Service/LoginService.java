package com.kr.co.board.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kr.co.board.Dao.LoginDAO;

@Service
public class LoginService {

		@Autowired
		private LoginDAO loginDAO;

		public void selectUserLogin(String userId) {
			loginDAO.selectUserLogin(userId);
		}

}
