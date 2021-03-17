package spring.boot.ch05.ex04.dao;

import java.util.List;

import spring.boot.ch05.ex04.domain.User;

public interface UserDao {
	List<User> getUsers();
	int update(User user);
}
