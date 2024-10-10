package com.excelr.ems.service;

import com.excelr.ems.model.Admin;
import com.excelr.ems.model.Employee;
import com.excelr.ems.repository.AdminRepository;
import com.excelr.ems.repository.EmployeeRepository;
import com.excelr.ems.security.UserPrincipal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Admin admin = adminRepository.findByUsername(username).orElse(null);
        if (admin != null) {
            return new UserPrincipal(admin);
        }

        Employee employee = employeeRepository.findByEmployeeCodeOrCompanyEmail(username, username).orElse(null);
        if (employee != null) {
            return new UserPrincipal(employee);
        }

        throw new UsernameNotFoundException("User not found");
    }
}
