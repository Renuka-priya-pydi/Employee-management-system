package com.excelr.ems.security;

import java.util.Collection;
import java.util.Collections;

import com.excelr.ems.model.Admin;
import com.excelr.ems.model.Employee;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserPrincipal implements UserDetails {

    private Admin admin;
    private Employee employee;

    // Constructor for Admin
    public UserPrincipal(Admin admin) {
        this.admin = admin;
    }

    // Constructor for Employee
    public UserPrincipal(Employee employee) {
        this.employee = employee;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Admins will have "ROLE_ADMIN" and employees will have "ROLE_EMPLOYEE"
        if (admin != null) {
            return Collections.singleton(new SimpleGrantedAuthority("ROLE_ADMIN"));
        } else if (employee != null) {
            return Collections.singleton(new SimpleGrantedAuthority("ROLE_EMPLOYEE"));
        }
        return null;  // Default case, though this should never happen
    }

    @Override
    public String getPassword() {
        // Return the password from either Admin or Employee entity
        if (admin != null) {
            return admin.getPassword();
        } else if (employee != null) {
            return employee.getPassword();
        }
        return null;
    }

    @Override
    public String getUsername() {
        // Return the username from either Admin or Employee entity
        if (admin != null) {
            return admin.getUsername();  // For Admin, it could be a username or email
        } else if (employee != null) {
            return employee.getEmployeeCode();  // For Employee, it could be employee code or email
        }
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;  // Customize if you have expiration logic
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;  // Customize if you have lock logic
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;  // Customize if needed
    }

    @Override
    public boolean isEnabled() {
        // Both Admin and Employee must be enabled
        if (admin != null) {
            return admin.isEnabled();
        } else if (employee != null) {
            return employee.isEnabled();
        }
        return false;
    }
}