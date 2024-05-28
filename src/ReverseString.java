
public class ReverseString {
	public static void main(String[] args) {

		String str = "Abhay";
		String revStr = "";
		System.out.println("The original strng is : " + str);
		
	 //Logic : 1
	    char ch; 		
		for (int i = str.length() - 1; i >= 0; i--) {
			ch = str.charAt(i);
			revStr = revStr + ch;
		}	
	/*
		//logic 2 :  using character Array
		
		char a[]=str.toCharArray();
		for (int i = a.length - 1; i >= 0; i--) {			
			revStr = revStr + a[i];
		}
	*/
		System.out.println("The Reverse string is : " + revStr);		
	/*	
	//Logic : 3
		StringBuffer sb = new StringBuffer(str);
		StringBuffer revStr1 = sb.reverse();
		System.out.println("The Reverse string is : " + revStr1);
		*/
	}	
}
