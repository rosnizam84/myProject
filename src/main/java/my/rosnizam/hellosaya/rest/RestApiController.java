package my.rosnizam.hellosaya.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.rosnizam.hellosaya.entity.Employee;
import my.rosnizam.hellosaya.services.EmployeeService;

@RestController
 @RequestMapping("/api") 
public class RestApiController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("")
	public String helloWorld() {
		return "hai";
		
	}
	
	@GetMapping("/senaraipekerja1")
	public List<Employee> getAllEmloyees(){
		return employeeService.getAllEmployees();
	}
	

}
