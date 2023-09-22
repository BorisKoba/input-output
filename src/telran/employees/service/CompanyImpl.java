package telran.employees.service;

import java.util.HashMap;
import java.util.List;

import telran.employees.dto.Employee;

public class CompanyImpl implements Company {
	
	HashMap<Long, Employee> employees = new HashMap<>();
	@Override
	public  boolean addEmployee(Employee empl) {
		boolean res = false;
		if(!employees.containsKey(empl.id())) {
		employees.put(empl.id(), empl);
			res = true;
		}
		return res;
	}

	@Override
	public Employee removeEmployee(long id) {
		Employee res = null;
		if(employees.containsKey(id)) {
			res = employees.remove(id);
		}
		return res;
	}

	@Override
	public Employee getEmployee(long id) {
		
		return employees.get(id);
	}

	@Override
	public List<Employee> getEmployees() {
		
		return (List<Employee>) employees.values();
	}

}
