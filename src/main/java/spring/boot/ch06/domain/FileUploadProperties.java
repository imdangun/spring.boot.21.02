package spring.boot.ch06.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="file")
public class FileUploadProperties {
	// file.upload-dir의 c:/DEV/upload 값이 DI 된다.
	private String uploadDir;
	
	public String getUploadDir() {
		return uploadDir;
	}
	
	public void setUploadDir(String uploadDir) {
		this.uploadDir = uploadDir;
	}
}
