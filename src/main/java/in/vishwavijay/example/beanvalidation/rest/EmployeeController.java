package in.vishwavijay.example.beanvalidation.rest;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.vishwavijay.example.beanvalidation.pojo.Employee;

@RestController
@RequestMapping(path= {"/api/employee"})
public class EmployeeController {
	
	@RequestMapping(path= {"/add"}, method= {RequestMethod.PUT})
	public Employee addEmployee(@Valid @RequestBody Employee employee) {
		
		
		return employee;
	}

}
