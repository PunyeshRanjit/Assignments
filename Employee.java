package com.student;

public class Employee {
	public void printDetails(int employeeId) {
        System.out.println("Employee ID: " + employeeId);
    }

    
    public void printDetails(double salary) {
        System.out.println("Salary: $" + salary);
    }

    
    public void printDetails(String department) {
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();

        
        employee.printDetails(1001);          
        employee.printDetails(50000.50);      
        employee.printDetails("Finance");     
    }
}
