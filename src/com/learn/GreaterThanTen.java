
package com.learn;

import java.util.Arrays;
import java.util.List;

public class GreaterThanTen {

	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(10,20,3,4,5,6,7,8,9);
		lst.stream().filter((n)->n>10).forEach((n)->System.out.println(n));
	}

}

