package spring.boot.ch02.dao;

import spring.boot.ch02.domain.Employee;

public interface EmployeeDao {
	Employee selectEmployee(int empId);
}
