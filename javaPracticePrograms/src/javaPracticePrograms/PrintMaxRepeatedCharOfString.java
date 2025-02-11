package javaPracticePrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PrintMaxRepeatedCharOfString {
	
	public static void main(String[] args) {
		String name="Hello World";
		String lowerCase=name.replaceAll("\s", "").toLowerCase();
		ArrayList<Character> s=new ArrayList<>();
		Map<Character,Integer> m= new HashMap<>();
		for(int i=0;i<lowerCase.length();i++) {
			if(m.containsKey(lowerCase.charAt(i))) {
				m.put(lowerCase.charAt(i), m.getOrDefault(lowerCase.charAt(i), 0)+1);
			}
			else {
				m.put(lowerCase.charAt(i), 1);
			}
		}
		
		int maxCount=0;
		char repeatedChar=lowerCase.charAt(0);
		for(Entry<Character, Integer> value:m.entrySet()) {
			if(maxCount<value.getValue()) {
				maxCount=value.getValue();
				repeatedChar=value.getKey();
			}
			if(value.getValue()==1) {
				
				s.add(value.getKey());
			}
		}
		
		System.out.println(s+" these characters are repeated 1 time");
		
		System.out.print(repeatedChar +" is repeated "+maxCount+ " times");
		

}
}
