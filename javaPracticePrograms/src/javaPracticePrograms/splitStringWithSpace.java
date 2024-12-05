package javaPracticePrograms;

public class splitStringWithSpace {
	
	public static void main(String[] args) {
		String data="Apple Microsoft Hcl";
		String[] companies=data.split(" ");
		
		for(String str: companies) {
			System.out.println(str);
		}
		
		
	}

}
