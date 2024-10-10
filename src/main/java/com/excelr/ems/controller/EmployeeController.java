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
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
    private EmployeeService employeeService;
	
    @GetMapping("/dashboard")
    public String employeeDashboard() {
        return "employeedashboard";
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

   
}
