package co.edu.board;

import lombok.Data;

@Data
public class LoginVO {
	private String id;
	private String passwd;
	private String name;
	private String email;
	private String responsibility;

	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

	@Override
	public String toString() {
		return "LoginVO [id=" + id + ", passwd=" + passwd + ", name=" + name + ", email=" + email + ", responsibility="
				+ responsibility + "]";
	}

	public LoginVO(String id, String passwd, String name, String email, String responsibility) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.email = email;
		this.responsibility = responsibility;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LoginVO(String id, String passwd, String name, String email) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LoginVO(String id, String passwd, String name) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.name = name;
	}

	public LoginVO(String id, String passwd) {
		super();
		this.id = id;
		this.passwd = passwd;
	}

	public LoginVO(String id) {
		super();
		this.id = id;
	}

	public LoginVO() {
		super();
	}


}
