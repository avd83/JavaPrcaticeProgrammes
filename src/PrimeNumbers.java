
public class PrimeNumbers {
	
	//prime number >1
	//prime number should have divisible by  and itself

	public static void main(String[] args) {

		int num = 4;
		int count = 0;

		if (num > 1) 
		{
			for (int i = 1; i <= num; i++) {

				if (num % i == 0)// 4%1:0,4%2:0,4%3:1,4%4:0
					count++;
			}
			if (count == 2) {
				System.out.println("The number is prime number");
			} 
			else 
			{
				System.out.println("The number is not prime number");
			}
		} 
		else 
		{
			System.out.println("The number is not prime number");
		}
	}
}
