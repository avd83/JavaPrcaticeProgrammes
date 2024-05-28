package SuperKeywordConcepts;

public class Parent {
	int a=33;
	int b=11;
	
	Parent(){		
		
		getSub();
	}
	
	public void getSub() {
		int c ;
		c = a-b;
		System.out.println(c);		
	}
	
	public void getAdd() {
		int c ;
		c = a+b;
		System.out.println(c);	
	}
	public static void main(String[] args) {
		

	}

}
