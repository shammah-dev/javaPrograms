package javaPracticePrograms;

public class Demo {
	
	public static void main(String args[]) {
		String a="ball";
		StringBuffer buffer= new StringBuffer(a);
		String newA= String.valueOf(buffer);
		String b="apple";
		System.out.println("value of a & b are "+ a+ ","+ b);
		int i = a.compareTo(b);
		System.out.println(i);
		if(a.compareTo(b)>0) {
			String temp=b;
			b=a;
			a=temp;
			
		}
		System.out.println("value of a & b after swap are "+ a+ ","+ b);
	}

}
