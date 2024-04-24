package hdfc.loans.carloans;

public class HDFC implements Rbi
{

	public static void main(String[] args) 
	{
		HDFC h = new HDFC();
		h.deposit();
		h.withdral();
	}

	@Override
	public void deposit() {
		System.out.println("iam overriden deposit in HDFC");
	}

	@Override
	public void withdral() {
		System.out.println("iam overriden withdral in HDFC");
	}

}
