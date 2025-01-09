package javaPracticePrograms;

public class ProgramToProveStringObjectsAreImmutable {
	
	
	public static void main(String args[]) {
		
		 String place = "Tennese";
		 
		String anotherPlace="Tennese";
		
		System.out.println(place == anotherPlace);
		
		String newPlace = new String("Tennese");
		
		System.out.println(place == newPlace);
		
		
		
		}

}
