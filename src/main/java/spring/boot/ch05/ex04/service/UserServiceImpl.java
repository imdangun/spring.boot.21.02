package spring.boot.ch05.ex04.service;

import java.util.List;

import spring.boot.ch05.ex04.dao.UserDao;
import spring.boot.ch05.ex04.domain.Level;
import spring.boot.ch05.ex04.domain.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void upgradeLevels() {
		List<User> users = userDao.getUsers();
		for(User user: users) {
			if(canUpgradeLevel(user)) upgradeLevel(user);
		}
	}
	
	private boolean canUpgradeLevel(User user) {
		Level currLevel = user.getLevel();
		boolean result = false;
		
		switch(currLevel) {
		case BASIC: result = user.getLoginCnt() >= 10; break;
		case SILVER: result = user.getLoginCnt() >= 20; break;
		case GOLD: result = false;
		}
		
		return result;
	}
	
	private void upgradeLevel(User user) {
		user.upgradeLevel();
		userDao.update(user);
	}
}
