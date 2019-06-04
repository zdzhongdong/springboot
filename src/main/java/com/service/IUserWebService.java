package com.service;

import java.util.List;

import com.entity.UserEntitiy;

public interface IUserWebService {
    /**
     * 获得所有用户
     * @return
     */
	public UserEntitiy getListUser();
}
