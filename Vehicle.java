package com.student;

public class Vehicle {
	public void printDetails() {
        System.out.println("This is a vehicle.");
    }

    
    public void printDetails(String model) {
        System.out.println("Model: " + model);
    }

    
    public void printDetails(String brand, String model) {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }

    
    public void printDetails(String brand, String model, int year) {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        
        vehicle.printDetails();                             
        vehicle.printDetails("Toyota");                     
        vehicle.printDetails("Ford", "Mustang");            
        vehicle.printDetails("Tesla", "Model 3", 2023);     
    }
}
