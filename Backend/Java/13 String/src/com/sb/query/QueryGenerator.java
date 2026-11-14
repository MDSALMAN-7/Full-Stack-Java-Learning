package com.sb.query;

public class QueryGenerator {
	public StringBuilder querygenerator(int salary, String empId) {
		
		StringBuilder query = new StringBuilder("Select * from employee");
		
		if(salary > 0) {
			query.append("Where salary = "+salary+";");
		}
		else if(empId != null) {
			query.append("Where empId "+empId+";");
			
		}
		else {
			query.append(";");
		}
		return query;
	}
}
