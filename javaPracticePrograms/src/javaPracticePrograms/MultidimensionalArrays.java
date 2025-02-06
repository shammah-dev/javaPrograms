package javaPracticePrograms;

import java.util.Arrays;

public class MultidimensionalArrays {
	
	public static void main (String args[]) {
		
		String[][] a = {{"a","b","c"},
		              {"d","e","f"},
		              {"g","h","i"}};
		System.out.println(Arrays.deepToString(a));
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++) {
				
				System.out.print(a[i][j]+ ",");
			}
		}
		
	}

}
