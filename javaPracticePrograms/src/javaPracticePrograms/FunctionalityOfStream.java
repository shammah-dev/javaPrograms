package javaPracticePrograms;

import java.util.ArrayList;

public class FunctionalityOfStream {
	public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Array");
        names.add("Angel");
        names.add("Rahul");
        long c = names.stream().filter(s->s.startsWith("A")).count();
        System.out.println(c);
        names.stream().filter(s->s.startsWith("A")).
        forEach(s->System.out.println(s));
        
        for(int i=0; i<names.size();i++) {
        	String name=names.get(i);
        	if(name.startsWith("A")) {
        	System.out.println(name);
        	}
        }
}
}