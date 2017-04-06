package com.cn.hnust.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.UserDao;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;
	
	public User getUserById(Integer id) {
	
		return this.userDao.selectByPrimaryKey(id);
	}
	
	

}
