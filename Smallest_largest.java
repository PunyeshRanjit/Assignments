package com.example;
import java.util.*;
public class Smallest_largest {
	public static void main(String[] args) {
        int arr[] = {1,2,3,35,5};
        Arrays.sort(arr); 
        System.out.println("Largest from an array = "+arr[4]);
        System.out.println("Smallest from an array = "+arr[0]);
}
}