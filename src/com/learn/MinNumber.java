package com.learn;
import java.util.Arrays;
import java.util.List;

public class MinNumber {

	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(1,2,3,4,5,6,7,8,9);
		int num =lst.stream().min(Integer::compare).get();
		System.out.println(num);
	}

}