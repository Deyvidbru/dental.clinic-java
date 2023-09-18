package model.entities;

public class SystemUsers {
	
	private String login;
	private String password;
	
	public SystemUsers() {
	}

	public SystemUsers(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
		return login;
	}
}
