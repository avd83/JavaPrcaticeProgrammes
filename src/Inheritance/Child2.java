package Inheritance;

public class Child2 extends Child {
	
	public void getdisplay2() {
		System.out.println("child2 class");		
	}
	
public static void main(String[] args) {
		
		Child2 c = new Child2();
		c.getDisplay();
		c.getdisplay1();
		c.getdisplay2();
	}

}
