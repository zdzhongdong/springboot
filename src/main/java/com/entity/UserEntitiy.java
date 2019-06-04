package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "h_user")
public class UserEntitiy {
	@Id
	@GenericGenerator(name = "myuuid", strategy = "uuid")
	@GeneratedValue(generator = "myuuid")
	@Column(length = 32)
	private String userId;
	@Column(length = 48)
	private String userName;
	@Column(length = 48)
	private String userPassword;
	@Column(length = 48)
	private String userTel;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

}
