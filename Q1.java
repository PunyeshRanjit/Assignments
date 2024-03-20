package com.student;

class Student{
	private String name= "Ram";
	private int rollno =40;
	private float marks= 50.5f;

	public void displayrecord () {
		System.out.println(this.name);
		System.out.println(this.rollno);
		System.out.println(this.marks);
	}
}
public class Q1 {
public static void main(String[] args) 
{
Student Student1 = new Student();
Student1.displayrecord();
Student Student2 = new Student();
Student2.displayrecord();
}

}
