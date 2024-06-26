package com.sathya.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class A_9 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<Integer>perfect=new ArrayList<Integer>();
		perfect.add(6);
		perfect.add(625);
		System.out.println("need to search: ");
		int n =s.nextInt();
		if(perfect.contains(n)) {
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Elements not found");
			
		}
		

	}

}
