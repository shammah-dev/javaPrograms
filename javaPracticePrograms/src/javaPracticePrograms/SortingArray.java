package javaPracticePrograms;

import java.util.Arrays;

public class SortingArray {
	
	public static void main(String args[]) {
	int[] a= {1,3,5,2,4};
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
		
			if(a[i]>a[j]) {
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
	}
	System.out.print(Arrays.toString(a));
	
	}

}
