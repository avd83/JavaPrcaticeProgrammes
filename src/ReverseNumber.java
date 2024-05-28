import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbe");
		int num = s.nextInt();
		
 	//Logic1 : 
		int rev = 0;		 
		while (num != 0) {

			rev = rev * 10 + num % 10;    //0+1234%10=4, 40+3=43 , 430+2=432 , 4320+1=4321
			num = num / 10;               //1234/10=123, 123/10=12, 12/10=1 , 1/10=0
		}

/*
   //Logic 2		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();		
*/	
/*
   //Logic 3 : 
	StringBuilder sb = new  StringBuilder();
	 sb.append(num);
	 StringBuilder rev = sb.reverse();
*/
		
	 System.out.println("the reverse number is : " + rev);
	}

}
