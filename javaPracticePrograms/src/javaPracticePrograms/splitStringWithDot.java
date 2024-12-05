package javaPracticePrograms;

public class splitStringWithDot {
	public static void main(String[] args) {
		String data="temp.All.Kotlin";
		String[] newString=data.split("\\.");
		for(String s:newString) {
			System.out.println(s);
		}
	}

}
