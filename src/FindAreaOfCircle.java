import java.util.Scanner;

public class FindAreaOfCircle {
	
	final static double pie = 3.14;	
	
	public static void main(String[] args) {
		
			
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radious");
		double r = s.nextDouble();
		
		double value = (pie*r*r);
		System.out.println(value);
	}
}
