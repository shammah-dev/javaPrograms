package javaPracticePrograms;

import java.util.Arrays;

//Write a method that will accept an array of int as an argument and it returns the max/min number from a given array.

public class PrintMaxAndMinNumberOfArray {
	
	public static void main(String[] args) {
		int[] values= {34,90,79, 98,56};
		int temp;
		for(int i=0;i< values.length;i++) {
			for(int j=i+1;j<values.length;j++) {
				if(values[i]>values[j]) {
					temp=values[j];
					values[j]=values[i];
					values[i]=temp;
								
				}
			}
			
		}
		System.out.println(Arrays.toString(values));
		System.out.println("min number is "+values[0]);
		System.out.println("max number is "+values[values.length-1]);
	}

}
