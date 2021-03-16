package spring.boot.ch02.dao.map;

import spring.boot.ch02.domain.Employee;

public interface EmployeeMap {
	Employee selectEmployee(int empId);
}
