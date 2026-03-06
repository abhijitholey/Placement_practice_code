package com.array_traversal;

public class SumOfArrayElements {

	public static void main(String[] args) {
		//array initialization and declaration
		int arr[]= {20,25,30,35,40,45};
		System.out.println("The elements of array are: ");
		//count variable delcared
		int count=0;
		//for loop to iterate the array
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
			count=count+arr[i];
		}
		System.out.println("The sum of array elements is: "+count);
	}

}
