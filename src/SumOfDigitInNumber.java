
public class SumOfDigitInNumber {
	
	static int sum = 0;

	public static void getLogic1(String num) {

		for (int i = 1; i <= num.length(); i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

	public static void getLogic2(int num) {

		while (num > 0) {
			int rem = num % 10; // 3+2+1
			sum = sum + rem;
			num = num / 10;// 123,12,1,0
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		getLogic1("12");
		getLogic2(123);
	}
}
