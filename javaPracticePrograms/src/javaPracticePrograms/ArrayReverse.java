package javaPracticePrograms;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] n= {1,3,4,5};
		int[] revArray= new int[n.length];
		int j=0;
		for(int i=n.length-1;i>=0;i--) {
			revArray[j]=n[i];
			j++;
		}
		System.out.println(Arrays.toString(revArray));
		}
	
}