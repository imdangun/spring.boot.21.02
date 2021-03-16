package spring.boot.ch02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.boot.ch02.dao.EmployeeDao;
import spring.boot.ch02.domain.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired private EmployeeDao empDao;
	
	@Override
	public Employee getEmployee(int empId) {
		return empDao.selectEmployee(empId);
	}
}
