
public class CountNumbersOfDigit {

	public static void main(String[] args) {
		
		int num=12345;
		int count=0;
		
		while(num>0) {
			
			num=num/10;//12345,1234,123,12,1
			count++;
		}
		System.out.println("the number digit count is : "+ count);
	}
}
