package spring.boot.ch06.ex01.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ch06/ex01")
public class SecController {	
	@GetMapping("/main")
	public void main() {}
	
	@GetMapping("/loginIn")
	public void loginIn() {}	

	
	@GetMapping("/article")
	public void article() {}
}
