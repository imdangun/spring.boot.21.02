package spring.boot.ch06.domain;

public class FileDownloadException extends RuntimeException {
	public FileDownloadException(String msg) {
		super(msg);
	}
	
	public FileDownloadException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
