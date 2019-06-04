package com.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.entity.User;

@Service("userService")
public class UserServiceImpl implements IUserService{
  @Autowired
  private JdbcTemplate jdbcTemplate;//spring的jdbc模板
  
  public List<User> getList(){
	  List<User> list=jdbcTemplate.query("select * from sys_user", new User());
  return list;
  }

  public void addUser(User u) {
	u.setUserId(UUID.randomUUID().toString().replaceAll("-",""));
	
  jdbcTemplate.update("insert into sys_user(user_id,user_name)values(?,?)",new Object[]{u.getUserId(),u.getUserName()});
  }
}
