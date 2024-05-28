
public class CountEvenOddDigitnumber {

	public static void getLogic1(int num2) {
	//	int num = num2;
		int even_no = 0;
		int odd_no = 0;

		while (num2 > 0) {
			int rem = num2 % 10; // 1234,123,12,1
			if (rem % 2 == 0) // 4,3,2,1
			{
				even_no++;// 4,2
			} else {
				odd_no++;// 1,3
			}
			num2 = num2 / 10; // 123 , 12 , 1
		}
		System.out.println("Logic1 Number of even numers " + even_no);
		System.out.println("Logic1 Number of odd numers " + odd_no);
	}

	public static void getLogic2(String num1) {		
		//String num =num1;
		int even_no = 0;
		int odd_no = 0;

		for (int i = 1; i <= num1.length(); i++) {
			String str = String.valueOf(i);
			if (Integer.parseInt(str) % 2 == 0) {
				even_no++;
			} else {
				odd_no++;
			}
		}
		System.out.println("Logic2 Number of even numers " + even_no);
		System.out.println("Logic2 Number of odd numers " + odd_no);
	}

	public static void main(String[] args) {
		getLogic1(1111);
		getLogic2("86482");
	}
}
