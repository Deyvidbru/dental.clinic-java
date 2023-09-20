package model.entities;

import model.exceptions.DomainException;

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

	public void returnFailed(String login, String password) {

		if (!login.equals(this.login) || !password.equals(this.password)) {
			throw new DomainException("Wrong login or password");
		}
		this.login = login;
		this.password = password;
	}
}
