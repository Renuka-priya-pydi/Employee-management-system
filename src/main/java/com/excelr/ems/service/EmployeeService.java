package com.excelr.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.ems.model.Employee;
import com.excelr.ems.repository.EmployeeRepository;


@Service
public class EmployeeService {

	@Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
           
    public Optional<Employee> findByEmployeeCodeOrCompanyEmail(String employeeCode, String companyEmail) {
        return employeeRepository.findByEmployeeCodeOrCompanyEmail(employeeCode, companyEmail);
    }
    
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    
    public Optional<Employee> findByEmployeeCode(String employeeCode) {
        return employeeRepository.findByEmployeeCode(employeeCode);
    }
    
    public Employee updateEmployee(String employeeCode, Employee employeeDetails) {
        // Find the employee by employeeCode
        Employee employee = employeeRepository.findByEmployeeCode(employeeCode)
            .orElseThrow(() -> new RuntimeException("Employee not found"));

        // Update fields using employeeDetails
        employee.setFullName(employeeDetails.getFullName());
        employee.setDateOfBirth(employeeDetails.getDateOfBirth());
        employee.setGender(employeeDetails.getGender());
        employee.setAge(employeeDetails.getAge());
        employee.setCurrentAddress(employeeDetails.getCurrentAddress());
        employee.setMobile(employeeDetails.getMobile());
        employee.setPersonalMail(employeeDetails.getPersonalMail());
        employee.setEmergencyContactName(employeeDetails.getEmergencyContactName());
        employee.setEmergencyContactMobile(employeeDetails.getEmergencyContactMobile());
        employee.setCompanyEmail(employeeDetails.getCompanyEmail());
        employee.setOfficeAddress(employeeDetails.getOfficeAddress());
        employee.setReportingManager(employeeDetails.getReportingManager());
        employee.setHrName(employeeDetails.getHrName());
        employee.setDateOfJoining(employeeDetails.getDateOfJoining());
        employee.setPreviousCompanyName(employeeDetails.getPreviousCompanyName());
        employee.setProjectCode(employeeDetails.getProjectCode());
        employee.setStartDate(employeeDetails.getStartDate());
        employee.setEndDate(employeeDetails.getEndDate());
        employee.setClientName(employeeDetails.getClientName());
        employee.setProjectManager(employeeDetails.getProjectManager());
        employee.setPanCard(employeeDetails.getPanCard());
        employee.setAadharCard(employeeDetails.getAadharCard());
        employee.setBankName(employeeDetails.getBankName());
        employee.setBranchName(employeeDetails.getBranchName());
        employee.setIfscCode(employeeDetails.getIfscCode());
        employee.setCtcBreakup(employeeDetails.getCtcBreakup());

        // Save the updated employee
        return employeeRepository.save(employee);
    }
    
    public void deleteByEmployeeCode(String employeeCode) {
        employeeRepository.deleteByEmployeeCode(employeeCode);
    }
    
    
}
