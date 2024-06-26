package com.sathya.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A_12 {

	public static void main(String[] args) {
		List<String>colors=new ArrayList<String>();
		colors.add("red");
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
		colors.add("blue");
		System.out.println(colors);
		List<String> names = Collections.nCopies(10, "rohith");
		System.out.println(names);
		List<String> list=new ArrayList<String>(colors.subList(2, 5));
		
		for(String color:list ) {
			System.out.println(color);
		}
	}

}
