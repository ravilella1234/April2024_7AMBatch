package hdfc.loans.homeloans;



class Parent
{
	public Number workHard()
	{
		System.out.println("Parent : wakeup early, goto college...");
		return 0;
	}
	
	public void atmostcare()
	{
		System.out.println("Parent : atmostcare");
	}
}


public class Child extends Parent
{
	
	public  Number workHard()
	{
		System.out.println("Child : wakeup anytime, goto movie...");
		return 0;
	}
	
	public void love()
	{
		System.out.println("Child : iam in love...");
	}

	public static void main(String[] args) 
	{
		Child c = new Child();
		c.workHard();
		c.atmostcare();
		c.love();
	}

}
