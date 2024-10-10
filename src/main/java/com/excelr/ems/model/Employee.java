package com.excelr.ems.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;


import jakarta.persistence.Column;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String employeeCode;

    @Column(nullable = false)
    private String fullName;

    @Column(unique = true, nullable = false)
    private String companyEmail;

    @Column(nullable = false)
    private String password;
    
    @Column(nullable = false)
    private String role = "EMPLOYEE";  // Default to EMPLOYEE
    
    @Column(nullable = false)
    private boolean enabled = true;  // Default to true, meaning account is enabled

    @Column(nullable = false)
    private String dateOfBirth;
    
    @Column(nullable = false)
    private String gender;
    
    @Column(nullable = false)
    private int age;
    
    @Column(nullable = false)
    private String currentAddress;
    
    @Column(nullable = false)
    private String city;
    
    @Column(nullable = false)
    private String mobile;
    
    @Column(nullable = false)
    private String personalMail;
    
    @Column(nullable = false)
    private String emergencyContactName;
    
    @Column(nullable = false)
    private String emergencyContactMobile;
    
    @Column(nullable = false)
    private String officeAddress;
    
    @Column(nullable = false)
    private String reportingManager;
    
    @Column(nullable = false)
    private String hrName;
    
    @Column(nullable = false)
    private String dateOfJoining;
    
    @Column(nullable = false)
    private String previousCompanyName;
    
    @Column(nullable = false)
    private String projectCode;
    
    @Column(nullable = false)
    private String startDate;
    
    @Column(nullable = false)
    private String endDate;
    
    @Column(nullable = false)
    private String clientName;
    
    @Column(nullable = false)
    private String projectManager;
    
    @Column(nullable = false)
    private String panCard;
    
    @Column(nullable = false)
    private String aadharCard;
    
    @Column(nullable = false)
    private String bankName;
    
    @Column(nullable = false)
    private String branchName;
    
    @Column(nullable = false)
    private String ifscCode;
    
    @Column(nullable = false)
    private String ctcBreakup;
    // Default constructor
    public Employee() {
        // No need to set the role again, it's already initialized
    }

    // Parameterized constructor
//    public Employee(Long id, String employeeCode, String fullName, String companyEmail, String password, String role, boolean enabled) {
//        this.id = id;
//        this.employeeCode = employeeCode;
//        this.fullName = fullName;
//        this.companyEmail = companyEmail;
//        this.password = password;
//        this.role = role != null ? role : "EMPLOYEE";  // Ensures role defaults to EMPLOYEE if null
//        this.enabled = enabled;
//    }
    
    

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public Employee(Long id, String employeeCode, String fullName, String companyEmail, String password, String role,
			boolean enabled, String dateOfBirth, String gender, int age, String currentAddress, String city,
			String mobile, String personalMail, String emergencyContactName, String emergencyContactMobile,
			String officeAddress, String reportingManager, String hrName, String dateOfJoining,
			String previousCompanyName, String projectCode, String startDate, String endDate, String clientName,
			String projectManager, String panCard, String aadharCard, String bankName, String branchName,
			String ifscCode, String ctcBreakup) {
		
		this.id = id;
		this.employeeCode = employeeCode;
		this.fullName = fullName;
		this.companyEmail = companyEmail;
		this.password = password;
		this.role = role != null ? role : "EMPLOYEE";
		this.enabled = enabled;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.age = age;
		this.currentAddress = currentAddress;
		this.city = city;
		this.mobile = mobile;
		this.personalMail = personalMail;
		this.emergencyContactName = emergencyContactName;
		this.emergencyContactMobile = emergencyContactMobile;
		this.officeAddress = officeAddress;
		this.reportingManager = reportingManager;
		this.hrName = hrName;
		this.dateOfJoining = dateOfJoining;
		this.previousCompanyName = previousCompanyName;
		this.projectCode = projectCode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.clientName = clientName;
		this.projectManager = projectManager;
		this.panCard = panCard;
		this.aadharCard = aadharCard;
		this.bankName = bankName;
		this.branchName = branchName;
		this.ifscCode = ifscCode;
		this.ctcBreakup = ctcBreakup;
	}

	public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPersonalMail() {
		return personalMail;
	}

	public void setPersonalMail(String personalMail) {
		this.personalMail = personalMail;
	}

	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	public String getEmergencyContactMobile() {
		return emergencyContactMobile;
	}

	public void setEmergencyContactMobile(String emergencyContactMobile) {
		this.emergencyContactMobile = emergencyContactMobile;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public String getReportingManager() {
		return reportingManager;
	}

	public void setReportingManager(String reportingManager) {
		this.reportingManager = reportingManager;
	}

	public String getHrName() {
		return hrName;
	}

	public void setHrName(String hrName) {
		this.hrName = hrName;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getPreviousCompanyName() {
		return previousCompanyName;
	}

	public void setPreviousCompanyName(String previousCompanyName) {
		this.previousCompanyName = previousCompanyName;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getCtcBreakup() {
		return ctcBreakup;
	}

	public void setCtcBreakup(String ctcBreakup) {
		this.ctcBreakup = ctcBreakup;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeCode=" + employeeCode + ", fullName=" + fullName + ", companyEmail="
				+ companyEmail + ", password=" + password + ", role=" + role + ", enabled=" + enabled + ", dateOfBirth="
				+ dateOfBirth + ", gender=" + gender + ", age=" + age + ", currentAddress=" + currentAddress + ", city="
				+ city + ", mobile=" + mobile + ", personalMail=" + personalMail + ", emergencyContactName="
				+ emergencyContactName + ", emergencyContactMobile=" + emergencyContactMobile + ", officeAddress="
				+ officeAddress + ", reportingManager=" + reportingManager + ", hrName=" + hrName + ", dateOfJoining="
				+ dateOfJoining + ", previousCompanyName=" + previousCompanyName + ", projectCode=" + projectCode
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", clientName=" + clientName
				+ ", projectManager=" + projectManager + ", panCard=" + panCard + ", aadharCard=" + aadharCard
				+ ", bankName=" + bankName + ", branchName=" + branchName + ", ifscCode=" + ifscCode + ", ctcBreakup="
				+ ctcBreakup + "]";
	}

   
}
