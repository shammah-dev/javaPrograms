package javaPracticePrograms;

import java.util.HashMap;

public class checkTheDuplicateCharofStringsNew2 {
	
	public static void main(String[] args) {
		String name="SAroj Manjula Rani";
		
		HashMap<Character,Integer> m=new HashMap<>();
		for(int i=0;i<name.length();i++) {
			if(m.containsKey(name.charAt(i))) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<name.length();j++) {
				String a=String.valueOf(name.charAt(i));
				String b=String.valueOf(name.charAt(j));
				if(a.equalsIgnoreCase(b)) {
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
