package StaticNonStaticVar;

public class StaticVar {
	
	String name;// Instance variable
	String address;
	static String city="pune";//static variable
	
	public StaticVar(String name,String address)
	{
		this.name=name;// local variables
		this.address=address;
				
	}
	
	public static void getChange() {
		
		city="MarineDrive"; // change the static variable value in static method only
	}
	
	public void getData()
	{
		System.out.println(name+" "+address+" "+city);
	}	

	public static void main(String[] args) {
		
		//StaticVar.city="kalyan";//static variable change the value 
		//getChange();//static method change the static variable value.
		
		StaticVar sv = new StaticVar("abhay","sambhajinagar");
		StaticVar sv1 = new StaticVar("apoorv","shaunagar");
		//getChange();//static method change the static variable value.
		//StaticVar.City="kalyan";//static variable change the value 
		
		sv.getData();
		sv1.getData();
		
		//getChange(); //static method change the static variable value.
		//StaticVar.City="kalyan";//static variable change the value 
	}

}
