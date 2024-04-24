package hdfc.loans.carloans;

public interface Rbi 
{
	int x = 100;
	
	public void deposit();
	public void withdral();

	public static void main(String[] args) 
	{
		//Rbi i1 = new Rbi();
		
		Rbi i;
		
		i = new ICICI();
		i.deposit();
		i.withdral();
		
		i = new HDFC();
		i.deposit();
		i.withdral();
	}
}
