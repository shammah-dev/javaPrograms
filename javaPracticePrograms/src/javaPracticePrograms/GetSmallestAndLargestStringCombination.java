package javaPracticePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GetSmallestAndLargestStringCombination {

	public static void main(String[] args) {
		String s="welcometojava";
		int n=s.length();
		int lenCom=5;
		String[] values=new String[n-lenCom+1];
		String temp;
		
		for(int i=0;i<=n-lenCom;i++) {
			int m = i+lenCom;
			System.out.println("i :"+i+" i+lenCom: "+m);
			values[i]=s.substring(i, i+lenCom);
		}
		System.out.println(Arrays.toString(values));
		int len=values.length;
		for(int i=0;i<values.length;i++) {
			for(int j=i+1;j<values.length;j++) {
		if(values[i].compareTo(values[j])>0) {
			temp=values[i];
			values[i]=values[j];
			values[j]=temp;
		}
			
			
			}
		}
		System.out.println(Arrays.toString(values));
	}
}
