package com.ranga.main;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.ranga.Spring4Hibernate4_Integration.EmployeeService;
import com.ranga.Spring4Hibernate4_Integration.EmployeeServiceImpl;
import com.ranga.entity.Employee;

@RestController
public class RESTController {
	@Autowired
	EmployeeService employeeService;

	//-------------------Retrieve All Employee
	@RequestMapping(value="/AllEmployees",method=RequestMethod.GET,produces = "application/json")
	public ResponseEntity<List<Employee>> GetAllEmployees(){
		List<Employee> employees=new ArrayList<Employee>();
		employees=employeeService.getAllEmployees();
		if(employees.isEmpty()){
			return new	ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
		}
		
		return new	ResponseEntity<List<Employee>>(employees,HttpStatus.OK);
		
	}
	
	//-------------------Retrieve Single Employee
	@RequestMapping(value="/RetrieveEmployee/{id}",method=RequestMethod.GET,produces = "application/json")
	public ResponseEntity<Employee> GetEmployeeByID(@PathVariable("id") long id){
		
		System.out.println("Fetching Employee with id " + id);
        Employee employee = employeeService.getEmployee(id);
        if (employee == null) {
            System.out.println("Employee with id " + id + " not found");
            return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);		
	}
	
	//-------------------Create a Employee
    
    @RequestMapping(value = "/CreateEmployee/", method = RequestMethod.POST)
    public ResponseEntity<Void> createUser(@RequestBody Employee employee,    UriComponentsBuilder ucBuilder) {
        System.out.println("Creating User " + employee.getName());
 
        /*if (employeeService.isUserExist(employee)) {
            System.out.println("A User with name " + user.getName() + " already exist");
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }*/
 
        employeeService.createEmployee(employee);
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/RetrieveEmployee/{id}").buildAndExpand(employee.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
 
     
    //------------------- Update a Employee 
     
    @RequestMapping(value = "/UpdateEmployee/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Employee> updateUser(@PathVariable("id") long id, @RequestBody Employee employee) {
        System.out.println("Updating Employee " + id);
         
        Employee employee1 = employeeService.getEmployee(id);
         
        if (employee1==null) {
            System.out.println("Employee with id " + id + " not found");
            return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
        }
 
        employee1.setName(employee.getName());
        employee1.setAge(employee.getAge());
        employee1.setSalary(employee.getSalary());
         
        employeeService.updateEmployee(employee1);
        return new ResponseEntity<Employee>(employee1, HttpStatus.OK);
    }
 
    //------------------- Delete a Employee
     
    @RequestMapping(value = "/DeleteEmployee/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Employee> deleteUser(@PathVariable("id") long id) {
        System.out.println("Fetching & Deleting Employee with id " + id);
 
        Employee employee = employeeService.getEmployee(id);
        if (employee == null) {
            System.out.println("Unable to delete. Employee with id " + id + " not found");
            return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
        }
 
        employeeService.deleteEmployee(id);
        return new ResponseEntity<Employee>(HttpStatus.NO_CONTENT);
    }
 
     
    
	
}
