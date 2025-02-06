package javaPracticePrograms;

import java.util.ArrayList;

public class FunctionalityOfStream2 {
	public static void main(String args[]) {
		ArrayList<String> names=new ArrayList<>();
		names.add("John");
		names.add("Array");
		names.add("Angel");
		names.add("hello");
		long c= names.stream().filter(s->s.startsWith("a")).count();
		System.out.println(c);
		
		
		names.stream().filter(s->s.startsWith("a")).forEach(s->System.out.println(s));
		
		
	}
}