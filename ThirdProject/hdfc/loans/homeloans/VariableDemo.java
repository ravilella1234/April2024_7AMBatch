package hdfc.loans.homeloans;

public class VariableDemo 
{
	//primitive variable
	int x = 100; // primitive instance variable
	static String cname = "vmware"; // primitive static variable
	static VariableDemo obj = new VariableDemo();
	
	
	public void m1()
	{
		int x = 200; // primitive local variable
		//System.out.println(y);
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(VariableDemo.cname);
	}
	
	public static void m2()
	{
		 obj = new VariableDemo();
		System.out.println(obj.x);
		System.out.println(VariableDemo.cname);
	}
	
	
	public static void main(String[] args) 
	{
		//non-primitive/reference variables
		 obj = new VariableDemo();
		System.out.println(obj.x);
		System.out.println(VariableDemo.cname);
	}

}
