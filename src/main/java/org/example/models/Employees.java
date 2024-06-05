package org.example.models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Employees {

    private int employeesId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String hireDate;
    private int jobId;
    private double salary;
    private int managerId;
    private int departmentId;

    public Employees(ResultSet rs) throws SQLException {
        employeesId = rs.getInt("employee_id");
        firstName = rs.getString("first_name");
        lastName = rs.getString("last_name");
        email = rs.getString("email");
        phoneNumber = rs.getString("phone_number");
        hireDate = rs.getString("hire_date");
        jobId = rs.getInt("job_id");
        salary = rs.getDouble("salary");
        managerId = rs.getInt("manager_id");
        departmentId = rs.getInt("department_id");

    }

    public Employees(int employeesId, String firstName, String lastName, String email, String phoneNumber, String hireDate,int jobId, double salary,int managerId,int departmentId) {
        this.employeesId = employeesId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.jobId =jobId;
        this.salary = salary;
        this.managerId = managerId;
        this.departmentId = departmentId;
    }

    public Employees() {

    }

    public int getEmployeesId() {
        return employeesId;
    }

    public void setEmployeesId(int employeesId) {
        this.employeesId = employeesId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employeesId=" + employeesId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", hireDate='" + hireDate + '\'' +
                ", jobId=" + jobId +
                ", salary=" + salary +
                ", managerId=" + managerId +
                ", departmentId=" + departmentId +
                '}';
    }
}
