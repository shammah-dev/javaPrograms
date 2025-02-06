package javaPracticePrograms;

import java.util.HashMap;

public class PrintMaxRepeatedCharAndMinRepeatedChar {
	
	public static void main (String args[]) {
		String name ="Shammhhgajhjh";
	   
	    HashMap<Character,Integer> max= new HashMap<>();
	    HashMap<Character,Integer> min= new HashMap<>();
	    
	    for(int i=0;i<name.length();i++) {
	    	 int count =1;
	    if(max.containsKey(name.charAt(i)) || min.containsKey(name.charAt(i)))	{
	    	continue;
	    }else {
	    	
	    	for(int j=i+1;j<name.length();j++){
	    	if(name.charAt(i)==name.charAt(j)) {
	    		count++;
	    	}
	    	}
	    	if(count>1) {
	    		max.put(name.charAt(i), count);
	    	}
	    	else {
	    		min.put(name.charAt(i), count);
	    	}	    	
	    }
	    }
	   
	  System.out.println(max);  
	  System.out.println(min); 
	  
	    
	}

}
