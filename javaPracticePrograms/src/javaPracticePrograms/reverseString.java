package javaPracticePrograms;
//String reverse. Write a method that will take one string as an argument and return the reverse version of this string.
public class reverseString {
	
	public  static void main(String[] args) {
		
		String name="Tommy";
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		
	}

}
