package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Queries{
	
	private int id;
    private LocalDate date;
    private String description;
    private Patients patient;
    
	public Queries() {

	}

	public Queries(int id, LocalDate date, String description, Patients patient) {
		this.id = id;
		this.date = date;
		this.description = description;
		this.patient = patient;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescricao(String description) {
		this.description = description;
	}

	public Patients getPatient() {
		return patient;
	}

	public void setPatient(Patients patient) {
		this.patient = patient;
	}
}
