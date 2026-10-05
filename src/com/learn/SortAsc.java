package com.learn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortAsc {

	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(10,1,2,3,4,5,6,7,8,9,9,9,8,8,7,6);
		
		lst.stream().sorted().forEach(System.out::print);
		System.out.println();
		lst.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
	}
}
