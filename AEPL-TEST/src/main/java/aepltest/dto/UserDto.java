package aepltest.dto;

import java.io.File;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name = "aepl_user_registration")
public class UserDto {
	private String name;
	private String email;
	@Id
	@Column(name = "mobile_number")
	private long mobileNum;
	@Column(name = "Date_of_Birth")
	@DateTimeFormat(pattern = "dd-mm-yyyy")
	private String date;
	
	@Lob
	private File file;

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	private String location;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "UserDto [name=" + name + ", email=" + email + ", mobileNum=" + mobileNum + ", date=" + date + ", file="
				+ file + ", location=" + location + "]";
	}

}
