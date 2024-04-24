package hdfc.loans.carloans;

public class ICICI implements Rbi
{

	public static void main(String[] args) 
	{
		ICICI i = new ICICI();
		i.deposit();
		i.withdral();
	}

	@Override
	public void deposit() 
	{
		System.out.println("iam overriden deposit in ICICI");
	}

	@Override
	public void withdral() 
	{
		System.out.println("iam overriden withdral in ICICI");
	}

}
