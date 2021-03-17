package spring.boot.ch03.ex03;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller("ch03.ex02")
@RequestMapping("/ch03/ex03/attach")
public class AttachController {
	@Value("${attachDir}")
	private String attachDir;
	
	@GetMapping
	public String main() {
		return "ch03/ex03/attachIn";
	}
	
	@PostMapping @ResponseBody
	public boolean attach(MultipartFile attachFile, HttpServletRequest request) {
		boolean isStored = false;
		String dir = request.getServletContext().getRealPath(attachDir);
		String fileName = attachFile.getOriginalFilename();
		
		try {
			save(dir + "/" + fileName, attachFile);
			isStored = true;
		} catch(Exception e) {}
		
		return isStored;
	}
	
	private void save(String fileName, MultipartFile attachFile) throws IOException {
		attachFile.transferTo(new File(fileName));
	}
}
