package com.tpv.struts.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpv.struts.User;
import com.tpv.struts.mapper.UserMapper;

@Service(value = "UserService")
public class UserServiceImpl implements UserService{
	  @Autowired
	    UserMapper userMapper;
	 
	  

		@Override
		public int insertUser(User user) {
		
			return userMapper.insertStudent(user);
			
		}
}
