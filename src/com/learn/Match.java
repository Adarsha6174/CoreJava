package com.learn;

import java.util.Arrays;
import java.util.List;

public class Match {

	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(10,1,2,3,4,5,6,7,8,9,9,9,8,8,7,6);
		
		boolean anyMatch = lst.stream().anyMatch((n)->n<5);
		
		System.out.println(anyMatch);
		
		boolean anyMatch1 = lst.stream().allMatch((n)->n>9);
		
		System.out.println(anyMatch1);

	}

}
