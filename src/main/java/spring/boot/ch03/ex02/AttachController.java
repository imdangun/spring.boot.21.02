package spring.boot.ch03.ex02;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/ch03/ex02/attach")
public class AttachController {
	@Value("${attachDir}")
	private String attachDir;
	
	@GetMapping
	public String main() {
		return "ch03/ex02/attachIn";
	}
	
	@PostMapping
	public String attach(MyFile myFile, Model model, HttpServletRequest request) {
		String dir = request.getServletContext().getRealPath(attachDir);		
		System.out.println("dir: " + dir);
		
		String fileName = myFile.getAttachFile().getOriginalFilename();	
		save(dir + "/" + fileName,  myFile.getAttachFile());
		
		model.addAttribute("title", myFile.getTitle());
		model.addAttribute("fileName", fileName);
		
		return "ch03/ex02/attachOut";
	}
	
	private void save(String fileName, MultipartFile attachFile) {
		try {
			attachFile.transferTo(new File(fileName));
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
