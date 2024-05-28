package Polymorphism;

public class Child extends Parent {

	int e;
	int f;
	
	public void getAdd(int e,int f) {
		c=e+f;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		
		Child c = new Child();
		c.getAdd(4, 5);
		c.getAdd(1, 2,3.3);
		c.getAdd(2,9);
	}

}
