package spring.boot.ch02.web;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import spring.boot.ch02.service.TodayService;

@Controller
public class TodayController {
	@Autowired private TodayService todayService;
	
	@GetMapping("/ch02/today")
	@ModelAttribute("today")
	public LocalDate today() {
		return todayService.getToday();
	}
}
