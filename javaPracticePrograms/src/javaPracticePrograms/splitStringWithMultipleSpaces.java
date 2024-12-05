package javaPracticePrograms;

public class splitStringWithMultipleSpaces {
	
	public static void main(String[] args) {
		String data="Hcl    Apple  Microsoft";
		String[] companies=data.split("\\s+");
		for(String s:companies) {
			System.out.println(s);
		}
	}

}
