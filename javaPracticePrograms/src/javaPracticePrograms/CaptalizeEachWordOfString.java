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
	
	
	
	String words="tell me about yourself";
	String[] wordsArray=words.split("\\s");
	String newSentence="";
	
	for(String s:wordsArray) {
	String firstLetter=	s.substring(0,1).toUpperCase();
	String otherwords=s.substring(1, s.length());
	String newWord=firstLetter+otherwords;
	newSentence=newSentence+" "+newWord;	
	}
	
	System.out.println(newSentence.trim());

}
}
