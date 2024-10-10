# Employee-management-system
## Description
The Employee Management System is a web application that allows employees to manage their personal and professional details, view project history, and download finance-related information. The system also provides an admin dashboard for employee management, including the ability to create, update, or delete employee records.

### Key Features:
- **Register & Role-Based Login**: Employees can log in using their company email or employment code, and access dashboards based on their roles (Admin/Employee).
- **Admin Dashboard**: Admins can view, add, update, or delete employee records and manage employee details.
- **Employee Dashboard**: Employees can view their own details, including personal information, project history, and finance data.
- **Project Details**: Manage project history with details like project code, client name, and reporting manager.
- **Finance Section**: Employees can view bank details, PAN, Aadhar, and download the last 6 months' payslips.
## Modules

### 1. Register and Role-based Login:
- Employees log in with a company email or employment code and password.
- Role-based access ensures Admins and Employees have different dashboards.

### 2. Admin Dashboard:
- **Create, Update, Delete Employees**: Admin can add or manage employee details including personal, professional, project, and finance details.
- **View Employee List**: The list shows basic employee information (Employment Code, Name, Email, Manager, Current Project) with options to view, edit, or delete.

### 3. Employee Dashboard:
- Employees can view their own details (personal, professional, and finance) and project history.
- They can download payslips for the last 6 months.

### 4. Employee Record Details:
Employee records consist of:
- **Personal Details**: Full name, DOB, Gender, Contact info, Address, etc.
- **Professional Details**: Employment Code, Company mail, Office Address, Reporting Manager, etc.
- **Project Details**: Project history, client names, start/end dates.
- **Finance**: PAN, Aadhar, Bank details, and payslip download.

## Setup and Installation

### Prerequisites:
- Java 17
- Spring Boot
- MySQL (or any database)

### Steps to Run the Application:
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/employee-management-system.git
   ```
2. Navigate to the project directory:
   ```bash
   cd employee-management-system
   ```
3. Build and run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```
4. Access the application:
   - Open your browser and go to `http://localhost:8080`

### Database Configuration:
- The database is configured in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
   spring.datasource.username=root
   spring.datasource.password=your_password
   ```
## Usage

### Admin Actions:
- **Create Employee**: Admin can fill in all sections, including Personal, Professional, Project, and Finance details.
- **Update/Delete Employee**: Admin can modify or delete existing employee records.

### Employee Actions:
- **View Personal and Professional Details**: Employees can view their information but cannot modify it.
- **Download Payslips**: Employees can download their payslips in PDF format for the last 6 months.
