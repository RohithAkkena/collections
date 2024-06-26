package com.sathya.collections;

import java.util.ArrayList;

public class A_7 {

	public static void main(String[] args) {
		ArrayList<String>mammals=new ArrayList<String>();
		mammals.add("Lion");
		mammals.add("Tiger");
		mammals.add("Fox");
		
		ArrayList<String>reptiles=new ArrayList<String>();
		reptiles.add("lizard");
		reptiles.add("crocodile");
		
		ArrayList<String>animals=new ArrayList<String>();
		animals.addAll(mammals);
		animals.addAll(reptiles);
		System.out.println(animals);

	}

}
