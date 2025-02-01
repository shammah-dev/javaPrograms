package javaPracticePrograms;

import java.util.Scanner;

/*
 * Two strings,  and , are called anagrams if they contain all the same c
 * haracters in the same frequencies. For this challenge, the test is not case-sensitive. 
 * For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
 */

public class Anagrams {	

	    static boolean isAnagram(String a, String b) {
	        String newA=sorting(a.toLowerCase());
	        String newB=sorting(b.toLowerCase());
	        boolean flag;
	        if(newA.equals(newB)){
	            flag=true;
	        }else{
	            flag=false;
	        }
	        return flag;
	        // Complete the function
	    }
	 public static String sorting(String a){
	     char[] charArray = a.toCharArray();
	     char temp;
	     for(int i=0;i<charArray.length;i++){
	         for(int j=i+1;j<charArray.length;j++){
	             if(charArray[i]>charArray[j]){
	                 temp=charArray[i];
	                 charArray[i]=charArray[j];
	                 charArray[j]=temp;
	             }
	             
	         }
	     }
	    String str = String.valueOf(charArray);
	    return str;
	}
	  public static void main(String[] args) {
	    
	       // Scanner scan = new Scanner(System.in);
	        String a = "hello";
	        String b = "Hello";
	       // scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}


