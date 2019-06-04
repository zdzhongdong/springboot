package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.entity.UserEntitiy;
@Component
public interface UserDao extends CrudRepository<UserEntitiy, String>{

	public List<UserEntitiy> findByUserNameAndUserTel(String userName,String userTel);
	
	@Query("from UserEntitiy where userName=?1 and userPassword=?2")
	public UserEntitiy findUserNameAndPassword(String userName,String pass);
	
	@Query(value="select * from h_user where user_name=?1 and user_Password=?2",nativeQuery=true)
	public UserEntitiy findUserNameAndPasswordSql(String userName,String pass);
	
}
