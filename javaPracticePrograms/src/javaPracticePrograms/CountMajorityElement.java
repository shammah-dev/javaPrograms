package javaPracticePrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountMajorityElement {
	
	public static void main(String args[]) {
		int[] a= {1,4,6,7,1,3,4,4,5,5,5};
		Arrays.sort(a);
		int n=a.length;
		System.out.println("the majority of number is "+ a[n/2]);
		
		Map<Integer, Integer> m=new HashMap<>();
		for(int i=0;i<n;i++) {
			m.put(a[i], m.getOrDefault(a[i], 0)+1);
			
			if((m.get(a[i]))>(n/2)) {
				System.out.println("the majority of number is "+ m.get(a[i]));
			}
		}
		
	}
    

}
