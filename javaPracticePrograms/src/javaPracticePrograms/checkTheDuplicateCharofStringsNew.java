package javaPracticePrograms;

import java.util.HashMap;

public class checkTheDuplicateCharofStringsNew {
	
	public static void main(String[] args) {
		String name="Shammahs";
		
		HashMap<Character, Integer> m=new HashMap<>();
		
		for(int i=0;i<name.length();i++) {
			int count=1;
			if(m.containsKey(name.charAt(i))) {
				continue;
			}
			for(int j=i+1;j<name.length();j++) {
				if((Character.toLowerCase(name.charAt(i)))== (Character.toLowerCase(name.charAt(j)))){
					count++;
				}
			}
			if(count>1) {
				m.put(name.charAt(i), count);
				System.out.println("Character "+name.charAt(i)+" is repeated " +m.get(name.charAt(i)));
			}
		}
		
	}

}
