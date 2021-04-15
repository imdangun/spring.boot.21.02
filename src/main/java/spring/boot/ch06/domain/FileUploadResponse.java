package spring.boot.ch06.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class FileUploadResponse {
	private String fileName;
	private String fileDownloadUri;
	private String fileType;
	private long size;	
}
