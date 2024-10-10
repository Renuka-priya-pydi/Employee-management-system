package com.excelr.ems.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.excelr.ems.model.Employee;
import com.excelr.ems.service.EmployeeService;


@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
    private EmployeeService employeeService;

    @GetMapping("/dashboard")
    public String adminDashboard() {
        return "admindashboard";
    }
    

    
    
 // GET: Retrieve all employees
    @GetMapping("/getAll")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // GET: Find employee by employee code or company email
    @GetMapping("/find")
    public ResponseEntity<Employee> findByEmployeeCodeOrCompanyEmail(
            @RequestParam(required = false) String employeeCode,
            @RequestParam(required = false) String companyEmail) {
        Optional<Employee> employee = employeeService.findByEmployeeCodeOrCompanyEmail(employeeCode, companyEmail);
        return employee.map(ResponseEntity::ok)
                       .orElseGet(() -> ResponseEntity.notFound().build());
    }
    
    @GetMapping("/getbycode/{employeeCode}")
    public ResponseEntity<Employee> getEmployeeByCode(@PathVariable String employeeCode) {
        Optional<Employee> employee = employeeService.findByEmployeeCode(employeeCode);
        return employee.map(ResponseEntity::ok)
                       .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // POST: Create a new employee
    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    // PUT: Update an existing employee by employee code
    @PutMapping("/update/{employeeCode}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable String employeeCode, @RequestBody Employee employeeDetails) {
        try {
            Employee updatedEmployee = employeeService.updateEmployee(employeeCode, employeeDetails);
            return ResponseEntity.ok(updatedEmployee);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // DELETE: Delete an employee by employee code
    @DeleteMapping("/delete/{employeeCode}")
    public ResponseEntity<String> deleteEmployee(@PathVariable String employeeCode) {
        try {
            employeeService.deleteByEmployeeCode(employeeCode);
            return ResponseEntity.ok("Employee deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(404).body("Employee not found");
        }
    }
}
