package com.example;
import java.util.*;

public class Third_largest {
	public static void main(String[] args) {
        int arr[] = {1,101,2,3,5,7,55,77,210,564,4578};
        Arrays.sort(arr);
        System.out.println("Third largest number is = "+arr[arr.length-3]);
}
}