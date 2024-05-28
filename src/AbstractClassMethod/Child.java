package AbstractClassMethod;

public class Child extends Parent{

	@Override
	public void getDisplay() {
		
		System.out.println("implement method in child class for parent");
		
	}
	
	public void getDisplayC() {
		System.out.println("child class non abstract method");
	}
	
	
	public static void main(String[] args) {
	//	Parent p = new Parent();// can not create object of abstract class 
		
		Child c = new Child();
		c.getDisplayP();
		c.getDisplay();
		c.getDisplayC();

	}

	

}
