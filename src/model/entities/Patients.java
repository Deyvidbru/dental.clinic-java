package model.entities;

public class Patients {
	private String name;
	private String cpf;
	private String phoneNumber;
	private String street;
	private String city;
	private String state;
	private String indication;
	
	public Patients() {
	}

	public Patients(String name, String cpf, String phoneNumber, String street, String city, String state,
			String indication) {
		this.name = name;
		this.cpf = cpf;
		this.phoneNumber = phoneNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.indication = indication;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIndication() {
		return indication;
	}

	public void setIndication(String indication) {
		this.indication = indication;
	}
}
