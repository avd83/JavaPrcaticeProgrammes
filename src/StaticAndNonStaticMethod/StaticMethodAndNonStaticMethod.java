package StaticAndNonStaticMethod;

public class StaticMethodAndNonStaticMethod {

	int a=1;
	static int b = 1;

	public static void main(String[] args) {

		System.out.println("this is main block"); 		
		StaticMethodAndNonStaticMethod staticMethodAndNonStaticMethod = new StaticMethodAndNonStaticMethod();
		StaticMethodAndNonStaticMethod.getData();//call through direct class
		staticMethodAndNonStaticMethod.getData1();//call through instance of the class or object
		
	}
	static {
		System.out.println("this is static block");
	}

	public static void getData() {

		int b=2;
		int x = b;
		System.out.println(x);
		//System.out.println(a);//can not access local variable in static methods
	}

	public void getData1() {

		int a=2;
		int b=3;
		int x = a;
		System.out.println(x);
		System.out.println(b);
	}
}
