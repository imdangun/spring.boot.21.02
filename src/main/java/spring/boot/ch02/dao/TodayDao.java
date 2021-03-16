package spring.boot.ch02.dao;

import java.time.LocalDate;

public interface TodayDao {
	LocalDate selectToday();
}
