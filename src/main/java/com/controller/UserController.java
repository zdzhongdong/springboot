package com.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.entity.User;
import com.entity.UserEntitiy;
import com.service.IHUserService;
import com.service.IUserService;

@RestController
public class UserController {
 
	@Autowired
	IUserService userService;
	@Autowired
	IHUserService hUserService;
	
	@RequestMapping("/userList2/{tag}")
	@ResponseBody
	public String getListJson2(@PathVariable("tag") String tag,String userName,String password){
	 
	//	UserEntitiy it=	hUserService.findUserObject(tag);
	  List<UserEntitiy> list=	hUserService.findAllUser();
		return JSON.toJSONString(list);
	}
	@RequestMapping("/userList2/{userName}/{userTel}")
	@ResponseBody
	public String findByuserNameAnduserTel(@PathVariable("userName") String userName,@PathVariable("userTel") String userTel){
		return JSON.toJSONString(hUserService.findByUserNameAndUserTel(userName, userTel));
	}
	@RequestMapping("/findUserNameAndPassword/{userName}/{pass}")
	@ResponseBody
	public String findUserNameAndPassword(@PathVariable("userName") String userName,@PathVariable("pass") String pass){
		return JSON.toJSONString(hUserService.findUserNameAndPassword(userName, pass));
	}
	
	
	@RequestMapping("/findUserNameAndPasswordSql/{userName}/{pass}")
	@ResponseBody
	public String findUserNameAndPasswordSql(@PathVariable("userName") String userName,@PathVariable("pass") String pass){
		return JSON.toJSONString(hUserService.findUserNameAndPasswordSQL(userName, pass));
	}
	@RequestMapping("/test")	
	public ModelAndView test(){
	List<User> list=	userService.getList();
	System.out.println(list.get(0).getUserName());
	ModelAndView m=new ModelAndView("index");
	m.addObject("user", list.get(0));
	m.addObject("list",list);
	return m;
	}
	@RequestMapping("/add")	
	public ModelAndView sava(UserEntitiy user){
		ModelAndView m=new ModelAndView("index");
	     
		hUserService.savaUser(user);
		
		m.addObject("user", user);
		return m;
	}
	@RequestMapping("/gotoadd")	
	public ModelAndView gotoadd(){
		ModelAndView m=new ModelAndView("add");
	
		return m;
	}
	@RequestMapping("/userList/{tag}")
	@ResponseBody
	public String getListJson(@PathVariable("tag") String tag,String userName,String password){
		List<User> list=	userService.getList();
		System.out.println(tag+"/"+userName+"/"+password);
		return JSON.toJSONString(list);
	}
	
	@RequestMapping("/listUser")	
	public ModelAndView listUser(){
		ModelAndView m=new ModelAndView("show");
		 List<UserEntitiy> list=	hUserService.findAllUser();
		
		m.addObject("userlist", list);
		return m;
	}
	@RequestMapping("/hello")
	
	public List<String> hello(String id) {
		System.out.println(id);
		List<String> list= new ArrayList<String>();
		list.add("123");
		list.add("321");
		return list;
	}

}
