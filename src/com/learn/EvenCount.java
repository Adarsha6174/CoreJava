package com.learn;

import java.util.Arrays;
import java.util.List;

public class EvenCount {

	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		long v =lst.stream().filter((n)->n%2==0).count();
		System.out.println(v);

	}

}
