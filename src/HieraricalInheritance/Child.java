package HieraricalInheritance;

public class Child extends Parent {	
	
	
	public void getdisplay1() {
		System.out.println("child class");		
	}	
	

	public static void main(String[] args) {
		
		Child c = new Child();
		c.getDisplay();
	}
}
