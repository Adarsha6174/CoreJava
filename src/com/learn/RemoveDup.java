package com.learn;

import java.util.Arrays;
import java.util.List;

public class RemoveDup {

	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(1,2,3,4,5,6,7,8,9,9,9,8,8,7,6);
		
		lst.stream().distinct().forEach(System.out::println);
		

	}

}
