package javaPracticePrograms;

import java.util.HashMap;

public class checkTheDuplicateCharOfString {
	
	public static void main (String args[]) {
		String name="sShammahhh";
		int count=1;
		
		HashMap<Character,Integer> value=new HashMap<>();
		
		for(int i=0;i<name.length();i++) {
			
			if(value.containsKey(name.charAt(i))) {
				continue;
				
			}
				
		
			for(int j=i+1;j<name.length();j++) {
				if(Character.toUpperCase(name.charAt(i)) ==(Character.toUpperCase(name.charAt(j)))) {
			//	if((name.charAt(i)) ==((name.charAt(j)))) {
				count++;
				
			}
			
			}
			if(count>1) {
				value.put(name.charAt(i), count);
				
				System.out.println("Letter "+name.charAt(i)+ " is repated " +value.get(name.charAt(i))+ " time");
				
			}
			count=1;
		}
	}

}
