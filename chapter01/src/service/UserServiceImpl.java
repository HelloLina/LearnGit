package service;

import dao.UserDao;

public class UserServiceImpl {
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao=userDao;
	}
	public void say() {
		this.userDao.say();
		System.out.println("userService say hello World");
	}
}
