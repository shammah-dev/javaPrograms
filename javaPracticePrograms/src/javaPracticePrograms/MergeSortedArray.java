package javaPracticePrograms;

import java.util.Arrays;

public class MergeSortedArray {
	
	public static void main(String args[]) {
		
		int[] a= {1,2,6,0,0,0};
		int[] b= {3,2,1};
		int m=3;
		int n=3;
		for(int i=0;i<n;i++) {
			a[i+m]=b[i];
		}
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp= a[i];
					a[i]=a[j];
					a[j]=temp;
				
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
