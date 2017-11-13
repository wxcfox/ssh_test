package xin.alifamily.service.impl;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import xin.alifamily.dao.UserDao;
import xin.alifamily.domain.User;
import xin.alifamily.service.UserService;

@Transactional(isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,readOnly=true)
public class UserServiceImpl implements UserService{
	
	private UserDao ud;
	
	public User getUserByCodePassword(User u) {

		System.out.println("getUserByCodePassword!");
			
		return null;
	}

	@Transactional(isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,readOnly=false)
	public void saveUser(User u) {
		ud.save(u);
		
	}

	public void setUd(UserDao ud) {
		this.ud = ud;
	}
	
}
