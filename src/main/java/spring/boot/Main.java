package spring.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import spring.boot.ch06.domain.FileUploadProperties;

@SpringBootApplication
@MapperScan("spring.boot.ch02.dao.map")
@EnableConfigurationProperties({FileUploadProperties.class})
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}