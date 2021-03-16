package spring.boot.ch02.dao;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.boot.ch02.dao.map.TodayMap;

@Repository
public class TodayDaoImpl implements TodayDao {
	@Autowired private TodayMap todayMap;
	
	@Override
	public LocalDate selectToday() {
		return todayMap.selectToday();
	}
}
