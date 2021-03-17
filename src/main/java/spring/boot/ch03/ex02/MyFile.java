package spring.boot.ch03.ex02;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyFile {
	private String title;
	private MultipartFile attachFile;
}
