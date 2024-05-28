package ExceptionHandling;

public class Throws {
	public void getNum(int num) {

		if (num < 1) {
			
			throw new ArithmeticException(" the given no is less then 1, so can not calculate suare");
			
		} else {
			
			System.out.println("Square of " + num + " is " + (num * num));
		}
	}

	public static void main(String[] args)  {

		Throws t =  new Throws();
		t.getNum(0);
		
	}
}
