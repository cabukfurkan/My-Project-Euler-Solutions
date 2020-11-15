package com.furkancabuk;

import java.util.ArrayList;

public class EvenFibonacciNumbers {

	public static void main(String[] args) {
	System.out.println(sumOfTheEvenFibonacciValues(4000000));

	}
	
	private static int sumOfTheEvenFibonacciValues(int limit) {
		ArrayList<Integer> fibonacciArrayList= new ArrayList<Integer>();
		fibonacciArrayList.add(1);
		fibonacciArrayList.add(2);
		int fibonacciNumber = 0;
		int sum=2;
		while(fibonacciNumber<limit) {
			fibonacciNumber=fibonacciArrayList.get(fibonacciArrayList.size()-1) + fibonacciArrayList.get(fibonacciArrayList.size()-2);
			fibonacciArrayList.add(fibonacciNumber);
			if(fibonacciNumber%2==0) {
				sum+=fibonacciNumber;
			}
		}
		return sum;
	}

}
