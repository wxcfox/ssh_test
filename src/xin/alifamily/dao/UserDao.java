package xin.alifamily.dao;

import xin.alifamily.domain.User;

public interface UserDao {
	
	//根据用户登陆名称查询user对象
	User getByUserCode(String usercode);
	//保存 用户
	void save(User u);
	
}
