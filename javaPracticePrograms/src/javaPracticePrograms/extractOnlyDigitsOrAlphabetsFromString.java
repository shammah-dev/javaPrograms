package javaPracticePrograms;

public class extractOnlyDigitsOrAlphabetsFromString {
	
	public static void main (String[] args) {
		String data="345Hello#0998iWorld..";
		
		String newData=data.replaceAll("[0-9]+", "");
		System.out.println(newData);
		
		String newData1=data.replaceAll("\\d", "");
		System.out.println(newData1);
		
		String newDataDigiti=data.replaceAll("[A-Z a-z]+", "");
		System.out.println(newDataDigiti);
		
		
		String newDataDigiti1=data.replaceAll("[^A-Za-z]+", "");
		System.out.println(newDataDigiti1);
		
		String newDataDigiti2=data.replaceAll("[^0-9]+", "");
		System.out.println(newDataDigiti2);
	}

}
