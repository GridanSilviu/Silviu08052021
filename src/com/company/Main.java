package com.company;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
		List<Integer> listOfNumbers = new ArrayList<>();
		listOfNumbers.add(10);
		listOfNumbers.add(20);

		int highestNumber = Integer.MIN_VALUE;
		for (int i = 0; i < listOfNumbers.size(); i++) {
			if (listOfNumbers.get(i) > highestNumber) {
				highestNumber = listOfNumbers.get(i);
			}
		}

		System.out.println(highestNumber);
	}
}
