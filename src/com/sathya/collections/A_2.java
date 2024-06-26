package com.sathya.collections;

import java.util.ArrayList;

public class A_2 {

	public static void main(String[] args) {
		ArrayList<Integer>prime_numbers=new ArrayList<Integer>();
		prime_numbers.add(2);
		prime_numbers.add(3);
		prime_numbers.add(5);
		prime_numbers.add(7);
		prime_numbers.add(11);
		System.out.println(prime_numbers);
		System.out.println(prime_numbers.size());
		Integer p2=prime_numbers.get(0);
		System.out.println(p2);
		Integer p3=prime_numbers.get(2);
		System.out.println(p3);
		Integer p4=prime_numbers.get(prime_numbers.size()-1);
		System.out.println(p4);
	}

}
