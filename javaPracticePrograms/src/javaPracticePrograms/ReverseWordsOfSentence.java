package javaPracticePrograms;

import java.util.Arrays;

//Write a method that will take a string as an argument. The method will reverse the position of words and return it.

public class ReverseWordsOfSentence {

	public static void main(String[] args) {
		String sentence="My name is Eclipse";
		
		String[] result = sentence.split(" ");
	
		for(int i = result.length-1; i>= 0; i--) {
			System.out.print(result[i]+" ");
		}
		System.out.println("");
		
		
		String newSen="";
		String[] newString=sentence.split("\\s");
		for(int i=newString.length-1;i>=0;i--) {
		newSen=newSen+" "+newString[i];
		}
		System.out.println(newSen.trim());
	}
}
