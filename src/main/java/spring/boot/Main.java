package spring.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("spring.boot.ch02.dao.map")
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}