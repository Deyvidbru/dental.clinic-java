package model.entities;

import java.util.ArrayList;
import java.util.List;

public class QueryData {
	
	List<Queries> queries = new ArrayList<>();

	public List<Queries> getConsulta() {
		return queries;
	}
	
	public void addConsultas(Queries querie) {
		queries.add(querie);
	}
}
