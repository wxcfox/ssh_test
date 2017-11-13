package xin.alifamily.service;

import xin.alifamily.domain.User;

public interface UserService {
	//登录方法
	User  getUserByCodePassword(User u);
	//注册用户
	void saveUser(User u);
}
