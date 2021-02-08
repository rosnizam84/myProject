package my.rosnizam.hellosaya.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.rosnizam.hellosaya.entity.Employee;
import my.rosnizam.hellosaya.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	//@Autowired
	private EmployeeRepository employeeRepo;
	
	
	@Autowired
	public EmployeeService(EmployeeRepository employeeRepo) {
		//super();
		this.employeeRepo = employeeRepo;
	}

	public void save(Employee employee) {
		employeeRepo.save(employee);
	}
	
	public List<Employee>getAllEmployees(){
		return employeeRepo.findAll();
	}

	public Employee getEmployee(int employeeId) {
		Employee searchEmployee= null;
		Optional<Employee> currentEmployee=employeeRepo.findById(employeeId);
		if(currentEmployee.isPresent()) {
			searchEmployee=currentEmployee.get();
		} else {
		 new RuntimeException("tak jumpa id employee!"+employeeId);
		}
		return searchEmployee;
	}
}
