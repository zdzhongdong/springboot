package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.entity.UserEntitiy;
@Service(value="hUserService")
public class HUserServiceImpl implements IHUserService{

	@Autowired
	private UserDao userDao;
	
	public List<UserEntitiy> findAllUser() {
		
		return (List<UserEntitiy>) userDao.findAll();
	}

	public List<UserEntitiy> findByUserNameAndUserTel(String userName,String userTel){
		return userDao.findByUserNameAndUserTel(userName, userTel);
	}

	@Override
	public UserEntitiy findUserNameAndPassword(String userName, String pass) {
		
		return userDao.findUserNameAndPassword(userName, pass);
	}

	@Override
	public UserEntitiy findUserNameAndPasswordSQL(String userName, String pass) {
		// TODO Auto-generated method stub
		return userDao.findUserNameAndPasswordSql(userName, pass);
	}

	@Override
	public void savaUser(UserEntitiy user) {
		userDao.save(user);
		
	}
}
