package application;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Consultas;
import model.entities.DadosConsulta;
import model.entities.Patients;
import model.entities.SystemUsers;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your password and login (don't forget them): ");
		String login = sc.nextLine();
		String password = sc.nextLine();
		SystemUsers user = new SystemUsers(login, password);

		try {
			System.out.print("Digite o login: ");
			login = sc.next();
			System.out.print("Digite a senha: ");
			password = sc.next();
			user.r
			
			while(true) {
				
				DadosConsulta dadosConsulta = new DadosConsulta();
				
				Patients patient = null;
				
				System.out.println("1 - add patients");
				System.out.println("2 - list patients");
				System.out.println("3 - add consultation");
				System.out.println("4 - out");
				int choice = sc.nextInt();
				
				switch(choice) {
				case 1:
					System.out.print("Name: ");
					String name = sc.nextLine();
					sc.nextLine();
					System.out.print("Cpf: ");
					String cpf = sc.next();
					sc.nextLine();
					System.out.print("Phone number: ");
					String phoneNumber = sc.next();
					System.out.print("Street: ");
					sc.nextLine();
					String street = sc.nextLine();
					System.out.print("City: ");
					String city = sc.nextLine();
					System.out.print("State: ");
					String state = sc.nextLine();
					System.out.print("Indication: ");
					String indication = sc.nextLine();
					patient = new Patients(name, cpf, phoneNumber, street, city, state, indication);
					
					break;
				case 2:
					for(Consultas consultas : dadosConsulta.getConsulta()) {
						System.out.println(consultas);
					}
					break;
				case 3:
					System.out.println("CPF of the patient to register consultation: ");
					String cpfConsultation = sc.nextLine();
					
					for(Consultas consultas : dadosConsulta.getConsulta()) {
						if(consultas.getPatient().getCpf().equals(cpfConsultation)) {
							System.out.println("Enter the id: ");
							int id = sc.nextInt();
							System.out.println("Enter the date: ");
							String date = sc.nextLine();
							System.out.println("Type the query description: ");
							String description = sc.nextLine();
							
							Consultas consulta = new Consultas(id, LocalDate.parse(date), description, patient);
							break;
						}
					}
					break;
				case 4:
					System.out.println("Ending the program!");
                    sc.close();
                    break;
				
				default:
					System.out.println("Invalid option. Please try again!");
                    break;
				}	
			}
			
		}catch(DomainException e) {
			System.out.println(e.getMessage());
		}
	}
}


}
