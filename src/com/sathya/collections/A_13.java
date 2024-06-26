package com.sathya.collections;

import java.util.ArrayList;
import java.util.Collections;

public class A_13 {

	public static void main(String[] args) {
		ArrayList<Integer>numbers=new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(7);
		numbers.add(2);
		numbers.add(5);
		numbers.add(30);
		numbers.add(53);
		numbers.add(2);
		System.out.println(numbers);
		System.out.println("*******************");
		Collections.reverse(numbers);
		System.out.println(numbers);
		System.out.println("max elements..."+Collections.max(numbers));
		System.out.println("min elements..."+Collections.min(numbers));
		System.out.println("elements 2 occured how many times... "+Collections.frequency(numbers, 2));

	}

}
