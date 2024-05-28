
public class Swap2Numbers {

	public static void main(String[] args) {
		
		int a=4;
		int b=8;
		int c;
		
		System.out.println("Before swaping :"+"a:"+a+", b:"+" "+b);
	/*
	 //Logic 1:
		c=b;
		b=a;
		a=c;
		System.out.println("After swaping :"+"a:"+a+", b:"+" "+b);
	*/
	
	   //Logic 2:
		a=a+b; // 10+20=30
		b=a-b;//  30-20=10
		a=a-b;//  30-10=20
		System.out.println("After swaping :"+"a:"+a+", b:"+" "+b);

		
	/*	//Logic 3:
		a=a*b;  // 10*20=200
		b=a/b;  // 200/20=10
		a=a/b;  //200/10=20
		
		System.out.println("After swaping :"+"a:"+a+", b:"+" "+b);
	*/
	}

}
