package com.string_traversal;
import java.util.*;
import java.io;
public class TraverseString {

	public static void main(String[] args) {
		
		String str="Abhijit";
		StringTraverse(str);
	}
	
	public static void StringTraverse(String str) {
		for(int i=0; i<=str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

}
