package ExceptionHandling;

public class TryCatchBlock {
	
	

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		int c;
		try {
			 c= a/b;
			System.out.println(c);	
		}catch (Exception e ){
			System.out.println("Divde By Zero exception");
			
		}finally {
			System.out.println(a/(b+2));
		}

	}

}
