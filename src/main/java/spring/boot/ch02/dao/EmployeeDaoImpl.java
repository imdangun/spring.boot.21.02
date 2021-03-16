package spring.boot.ch02.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.boot.ch02.dao.map.EmployeeMap;
import spring.boot.ch02.domain.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired private EmployeeMap empMap;
	
	@Override
	public Employee selectEmployee(int empId) {
		return empMap.selectEmployee(empId);
	}
}
