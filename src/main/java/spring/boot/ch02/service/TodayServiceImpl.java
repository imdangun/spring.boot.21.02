package spring.boot.ch02.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.boot.ch02.dao.TodayDao;

@Service
public class TodayServiceImpl implements TodayService {
	@Autowired private TodayDao todayDao;
	
	@Override
	public LocalDate getToday() {
		return todayDao.selectToday();
	}
}
