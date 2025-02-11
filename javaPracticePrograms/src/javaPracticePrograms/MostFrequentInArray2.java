package javaPracticePrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class MostFrequentInArray2
{
  public static void main(String args[]) {
	  int[] a= {1,3,4,8,1,1,3,3,3,4,4,4};
	  Map<Integer,Integer> m=new HashMap<>();
	  for(int i=0;i<a.length;i++) {
		  
			if(m.containsKey(a[i])) {
				m.put(a[i], m.getOrDefault(a[i], 0)+1);
			}else {
				m.put(a[i], 1);
			
		  }
	  }
	  int maxCount=0; int repeatedNum=a[0];
	  for(Entry<Integer, Integer> value:m.entrySet() ) {
		  if(maxCount<value.getValue()) {
			  maxCount=value.getValue();
			  repeatedNum=value.getKey();
		  }
	  }
	  System.out.print(repeatedNum+" is repeated "+maxCount);
	 
  }
	  
}
