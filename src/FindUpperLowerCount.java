

public class FindUpperLowerCount {

	public static void main(String[] args) {
				
		String s = "Welcome To Automtion";		
		String lower = "";
		String upper = "";	
		int lower1=0;
		int upper1=0;
		
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);			
			if(ch>=65 && ch<=90){
				upper=upper+ch;	
				upper1++;
			}
			else{
				lower=lower+ch;
				lower1++;
			}			
		}
		System.out.println(upper);
		System.out.println(upper1);
		System.out.println(lower);
		System.out.println(lower1);
	}
}
