package com.sathya.collections;

import java.util.ArrayList;

public class A_10 {

	public static void main(String[] args) {
		ArrayList<Integer>armstrong=new ArrayList<Integer>();
		armstrong.add(6);
		armstrong.add(125);
		if(armstrong.isEmpty()) {
			System.out.println("list is already empty");
		}
		else
			armstrong.clear();
		System.out.println("List is cleared");

	}

}
