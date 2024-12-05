package javaPracticePrograms;

import java.util.Scanner;

	public class ArraySort {

	    public static String getSmallestAndLargest(String s, int k) {
	        String smallest = "";
	        String largest = "";
	        
	       String subString[] = new String[s.length() -(k-1)];
	       
	       int  lengthOfString=s.length();
	       System.out.println(lengthOfString);
	       
	       int lengthOfCombination=s.length() -(k-1);
	      System.out.println(lengthOfCombination);
	      
	      for(int i=0; i< s.length() -(k-1); i++){
	            subString[i] = s.substring(i,i+k);
	            
	       }
	       
	       
	      String temp; 
	       for(int i=0; i< subString.length  ;i++){
	           for(int j = i+1; j<subString.length; j++ ){
	               if(subString[i].compareTo(subString[j]) >0){
	                   temp = subString[i];
	                   subString[i] = subString[j];
	                   subString[j]= temp;
	                   
	               }
	               
	           }
	           
	       }
	       
	       smallest = subString[0];
	        largest = subString[subString.length-1];
	        // Complete the function
	        // 'smallest' must be the lexicographically smallest substring of length 'k'
	        // 'largest' must be the lexicographically largest substring of length 'k'
	        
	        return smallest + "\n" + largest;
	    }


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(s, k));
	    }
	}


