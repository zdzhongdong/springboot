package com.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.entity.UserEntitiy;

public interface IHUserService{


    /**
     * 查询所有用户
     * @return
     */
	public List<UserEntitiy> findAllUser();
	/**
	 * 根据用户名和电话进行查询
	 * @param userName
	 * @param userTel
	 * @return
	 */
	public List<UserEntitiy> findByUserNameAndUserTel(String userName,String userTel);
	/**
	 * 根据用户名和密码查询用户
	 * @param userName
	 * @param pass
	 * @return
	 */
	public UserEntitiy findUserNameAndPassword(String userName,String pass);
	
	public UserEntitiy findUserNameAndPasswordSQL(String userName,String pass);
	
	public void savaUser(UserEntitiy user);
}
