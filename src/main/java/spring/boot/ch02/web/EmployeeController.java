package spring.boot.ch02.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import spring.boot.ch02.domain.Employee;
import spring.boot.ch02.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired private EmployeeService empService;
	
	@GetMapping("/ch02/employee/{empId}")
	public String findEmployee(@PathVariable int empId, Model model) {
		Employee emp = empService.getEmployee(empId);
		model.addAttribute("emp", emp);
		
		return "ch02/employee";		
	}
}
