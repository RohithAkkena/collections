package com.sathya.collections;

import java.util.LinkedList;

public class A_14 {

	public static void main(String[] args) {
		LinkedList<Integer>number=new LinkedList<Integer>();
		for(int i=1;i<=10;i++) {
			number.add(i);
		}
		System.out.println(number);
		number.addFirst(100);
		number.addLast(200);
		System.out.println(number);
LinkedList<Integer> even=new LinkedList<Integer>();
        
        for(Integer i:number) {
        	if(i%2==0) {
        		even.add(i);
        	}
        }
        even.remove(0);
       even.remove(even.size()-1);
        
        for(Integer i:even) {
        	System.out.println(i+" ");
        }

	}

}
