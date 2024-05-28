
public class PalindromeString {

	public static void main(String[] args) {
		String str="mom";
		String nStr="";
		char ch;
		System.out.println("The original strng is : "+str);
		for(int i=str.length()-1;i>=0;i--) {
			ch=str.charAt(i);
			nStr=nStr+ch;
		}
		System.out.println("The Reverse string is : "+nStr);
		if(str.equals(nStr)) {
			System.out.println("the strng is Palndrome");
		}else {
			System.out.println("The strng is not Palndrome");
		}
	}

}
