package SuperKeywordConcepts;

public class Child extends Parent {

	Child(){
		
		super();
	}
	
	public void getFormula() {
		super.getAdd();
	}
	public static void main(String[] args) {
	
		Child c = new Child();
		c.getFormula();
		
	}

}
