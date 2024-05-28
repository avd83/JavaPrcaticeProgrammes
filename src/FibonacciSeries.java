
public class FibonacciSeries {

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		
		System.out.println(n1 + "\n" + n2);

		for (int i = 2; i <=5; i++) {
			sum = n1 + n2;//1,2,3,5
			System.out.println("\n"+sum);// 0,1,1,2,3,5
			n1 = n2;
			n2 = sum;
		}
	}
}
