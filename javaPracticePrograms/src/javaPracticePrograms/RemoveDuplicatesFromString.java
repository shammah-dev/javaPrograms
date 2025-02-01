package javaPracticePrograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {
	public static void main(String[] args) {
		String name="shammah";
		StringBuilder newName =new StringBuilder();
		
		
		Set<Character> removeDuplicate=new HashSet<>();
		for(int i=0;i<name.length();i++) {
			removeDuplicate.add(name.charAt(i));
		}
		System.out.println(removeDuplicate);
		
		System.out.println(	String.valueOf(removeDuplicate));
		
		for(char s:removeDuplicate) {
			newName.append(s);
		}
		System.out.println(newName);
	}

}
