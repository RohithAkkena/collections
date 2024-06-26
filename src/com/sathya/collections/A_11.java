package com.sathya.collections;

import java.util.ArrayList;
import java.util.Collections;

public class A_11 {

	public static void main(String[] args) {
		ArrayList<String>colors=new ArrayList<String>();
		colors.add("red");
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
		colors.add("blue");
		System.out.println(colors);
		System.out.println("*************************");
		Collections.swap(colors, 2, 4);
		System.out.println(colors);
		System.out.println("**************************");
		Collections.shuffle(colors);
		System.out.println(colors);
		System.out.println("*****************************");
		Collections.reverse(colors);
		System.out.println(colors);

	}

}
