
public class Test {

	int a=1;
	static int b = 1;

	public static void main(String[] args) {

		Test test = new Test();
		Test.getData();//call through direct class
		test.getData1();//call through instance of the class or object
		
	}

	public static void getData() {

		// int b=2;
		int x = b;
		System.out.println(x);
	}

	public void getData1() {

		int a=2;
		int x = a;
		System.out.println(x);
	}
}
