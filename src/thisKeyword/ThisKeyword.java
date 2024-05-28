package thisKeyword;

public class ThisKeyword {
	
	int a;
	int b;
	
	ThisKeyword(){
		
		System.out.println("call first default constructor");
	}
	
	ThisKeyword(int a,int b){
		this();
		this.dispaly();//call current class method
		this.a = a;
		this.b=b;
		
	}
	public void getDisplay() {
		int c = a+b;
		System.out.println(c);
	}
	
	public void dispaly() {
		System.out.println("call method ");
	}

	
	public static void main(String[] args) {
		ThisKeyword tk = new ThisKeyword(2,5);
		tk.getDisplay();
	}
}