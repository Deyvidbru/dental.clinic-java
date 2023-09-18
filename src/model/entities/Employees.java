package model.entities;

public class Employees {
	
	private String name;
	private String cpf;
	private String phoneNumber;
	private String street;
	private String city;
	private String state;
	private Double salary;
	private String function;
	
	public Employees() {
	}

	public Employees(String name, String cpf, String phoneNumber, String street, String city, String state,
			Double salary, String function) {
		this.name = name;
		this.cpf = cpf;
		this.phoneNumber = phoneNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.salary = salary;
		this.function = function;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public String getState() {
		return state;
	}
}
