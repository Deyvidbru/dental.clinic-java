package application;

import model.entities.Employees;
import model.entities.Patients;
import model.entities.SystemUsers;

public class Program {

	public static void main(String[] args) {
		
		SystemUsers users = new SystemUsers("adm", "adm123");
		Patients patients = new Patients("Marcos", "123.456.789-23", "88 92435-8976", "Guanabra street", "Vale do Silício", "Califórnia", "Linkedin");
		Employees employees = new Employees("Kátia", "987.654.321-12", "84 98812-3219", "Street of happiness", "São José", "São Paulo", 1200.00, "Assistant");
	}

}
