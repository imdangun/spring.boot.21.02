package spring.boot.ch05.ex04.service;

import static org.junit.Assert.assertSame;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import spring.boot.ch05.ex04.dao.UserDao;
import spring.boot.ch05.ex04.domain.Level;
import spring.boot.ch05.ex04.domain.User;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
	private List<User> users;
	@Mock private UserDao userDao;
	
	@Before
	public void setUp() {
		users = Arrays.asList(
			new User("최한석", Level.BASIC, 9),
			new User("최판돌", Level.BASIC, 10),
			new User("한아름", Level.SILVER, 19),
			new User("한승일", Level.SILVER, 20),
			new User("라다희", Level.GOLD, 30));
	}
	
	@Test
	public void upgradeLevels() {		
		when(userDao.getUsers()).thenReturn(this.users);
		
		UserServiceImpl userService = new UserServiceImpl();
		userService.setUserDao(userDao);
		
		userService.upgradeLevels();
		
		verify(userDao, times(2)).update(any(User.class));
		verify(userDao).update(users.get(1));
		assertSame(users.get(1).getLevel(), Level.SILVER); 
		verify(userDao).update(users.get(3));
		assertSame(users.get(3).getLevel(), Level.GOLD);
		
		assertSame(users.get(0).getLevel(), Level.BASIC);
		assertSame(users.get(2).getLevel(), Level.SILVER);
		assertSame(users.get(4).getLevel(), Level.GOLD);
	}
}
