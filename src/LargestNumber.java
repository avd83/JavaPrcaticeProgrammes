public class LargestNumber {

	public static void getLargestNumberLogic1(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println(a + " : is larget number");
		} else if (b > a && b > c) {
			System.out.println(b + " : is larget number");
		} else if (c > a && c > b) {
			System.out.println(c + " : is larget number");
		}
	}

	public static void getLargestNumberLogic2(int a, int b, int c) {
		int largestNumber = a > b ? a : b;
		int largestNumber1 = c > largestNumber ? c : largestNumber;
		System.out.println(largestNumber1 + " : is larget number");
	}

	public static void main(String[] args) {

		getLargestNumberLogic1(100, 200, 300);
		getLargestNumberLogic2(10, 20, 30);
	}
}