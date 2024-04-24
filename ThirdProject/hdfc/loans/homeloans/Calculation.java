package hdfc.loans.homeloans;

public class Calculation 
{
	int a,b,c;
	
	public Calculation(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void add()
	{
		c = a+b;
		System.out.println("Add of A  & B i : " +c);
	}
	
	public void sub()
	{
		c = a-b;
		System.out.println("Sub of A & B iS : " +c);
	}


	public static void main(String[] args) 
	{
		Calculation c1 = new Calculation(100, 200);
		c1.add();
		c1.sub();
	}

}
