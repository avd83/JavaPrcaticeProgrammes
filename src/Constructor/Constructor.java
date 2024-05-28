package Constructor;

public class Constructor {
	
	Constructor(){
		getDisplay() ;//call default constructor
		
	}
	
	Constructor(int a){
		System.out.println("Call parametrized constructor");//call parameterized constructor
	}
	
	Constructor(Constructor c){
		System.out.println("Call copy constructor constructor");//call other constructor 
	}
	
	public void getDisplay() {
		System.out.println("Call bydefault constructor");
	}

	public static void main(String[] args) {
		Constructor c = new Constructor();
		Constructor c1 = new Constructor(2);
		Constructor c2 = new Constructor(c1);
		//c.getDisplay();
	}

}
