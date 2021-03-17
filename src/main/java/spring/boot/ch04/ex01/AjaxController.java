package spring.boot.ch04.ex01;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/ch04/ex01")
public class AjaxController {
	@GetMapping("/main")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("ch04/ex01/ajax");
		return mv;
	}
	
	@GetMapping("/get")
	public User get(int userId, @RequestParam String userName, 
			@DateTimeFormat(pattern="yyyy-MM-dd") LocalDate birthday) {
		return new User(userId, userName, birthday);
	}
	
	@PostMapping("/post")
	public User post(@RequestBody User user) {
		return user;
	}
	
	@PutMapping("/put")
	public User put(@RequestBody User user) {
		return user;
	}
	
	@PatchMapping("/patch")
	public User patch(@RequestBody User user) {
		return user;
	}
	
	@DeleteMapping("/delete")
	public User delete(@RequestBody User user) {
		return user;
	}
}
