package org.sum;

public class Sum {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				sum= sum+i;
			}
		}
		System.out.println("Sum of odd numbers is "+sum);
		System.out.println("Update code done for SumOfOdd");
		System.out.println("ram");
		
	}
}
