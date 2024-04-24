package hdfc.loans.carloans;

public class FirstClass 
{
	//dataProperties
	int a=10,b=20, c;
	
	//Operations(Behaviours)
	public void add()
	{
		c = a+b;
		System.out.println("Add of A & B is :" + c);
	}
	
	public void sub()
	{
		c = a-b;
		System.out.println("sub of A & B is :" + c);
	}

	public static void main(String[] args) 
	{
		System.out.println("Hi");
		
		//int x = 100;
		//char ch = 'a';
		
		FirstClass obj = new FirstClass();
		obj.add();
		obj.sub();
	}

}
