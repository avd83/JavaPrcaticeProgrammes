package Polymorphism;

public class Parent {
	double d;
	int a;
	int b;
	int c;

	public void getAdd(int a, int b) {
		c = a + b;
		System.out.println(c);

	}

	public void getAdd(int a, int b, double d) {
		c = (int) (a + b + d);
		System.out.println(c);
	}

	public static void main(String[] args) {

		Parent p = new Parent();
		p.getAdd(2, 3);
		Parent p1 = new Parent();
		p1.getAdd(2, 3, 5.7);
	}

}
