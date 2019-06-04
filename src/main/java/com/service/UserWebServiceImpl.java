package com.service;

import javax.jws.WebService;

import com.entity.UserEntitiy;
@WebService
public class UserWebServiceImpl implements IUserWebService {

	@Override
	public UserEntitiy getListUser() {
	  UserEntitiy user=new UserEntitiy();
	  user.setUserId("1");
	  user.setUserName("赵云");
	  user.setUserPassword("123456");
		return user;
	}

}
