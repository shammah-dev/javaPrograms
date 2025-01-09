package javaPracticePrograms;

public class CaptalizeEachWordOfString {
	
	public static void main(String args[]) {
		
		String input = "i am enginer";
		char[] outputArray = input.toCharArray();
		
		outputArray[0] =  Character.toUpperCase(input.charAt(0)) ;
		for (int i = 1; i < input.length();i++) {
			
			if(input.charAt(i-1) == ' ') {
				outputArray[i] = Character.toUpperCase(input.charAt(i));
			}
			else {
				outputArray[i] = input.charAt(i);
			}		
			
		}
		
		System.out.println(outputArray);
	}

}
