package spring.boot.ch02.domain;

import java.time.LocalDate;
import lombok.Getter;

@Getter
public class Employee {
	private int empId;
	private String empName;
	private LocalDate hireDate;
}
