package com.sunbeam;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Program {
	public static void main(String[] args) {
		int sum = IntStream.rangeClosed(1, 10)
				.limit(10)
				 .sum();
		System.out.println("Sum = "+ sum);
		
		IntSummaryStatistics summary = IntStream.rangeClosed(1, 10)
				 .summaryStatistics();
		
		System.out.println(summary);
	}
}
