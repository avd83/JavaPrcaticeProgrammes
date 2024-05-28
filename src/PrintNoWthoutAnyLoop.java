
public class PrintNoWthoutAnyLoop {

	public static void main(String[] args) {

		printNumber(1);
		printNumber(1,100);
	}

	public static void printNumber(int num) {
		
		if(num<=100){			
			System.out.println(num);
			num++;
			printNumber(num);			
		}
	}

	public static void printNumber(int sNum,int eNum) {

		if (sNum <= eNum) {
			System.out.println(sNum);
			sNum++;
			printNumber(sNum);
		}
	}
}
