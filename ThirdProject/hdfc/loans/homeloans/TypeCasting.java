package hdfc.loans.homeloans;

public class TypeCasting 
{

	public static void main(String[] args) 
	{
		// byte-1, short-2, int-4, long-8, float-4, double-8
		
		//1-liter ---> 500ml   ---> There is no risk  ---> widening
		//1-liter ---> 1.5ltr  ---> There is a risk (water overflow) ---> Narrowing
		
		
		//Type casting from primitive type to another primitive type
		
		int x1 = 65;
		System.out.println(x1);
		
		//double x2 = x1;
		double x2 = (double)x1;
		System.out.println(x2);
		
		int x3 = (int)x2;
		System.out.println(x3);
		
		char x4 = (char)x3;
		System.out.println(x4);
		
		//Type casting from primitive type to corresponding wrapper class type
		
		int i1 = 100;
		System.out.println(i1);
		
		Integer i2 = Integer.valueOf(i1);
		System.out.println(i2);
		
		int i3 = (int)i2;
		System.out.println(i3);
		
		//Type casting from one wrapper class type to another wrapper class type
		
		String s1 = "200";
		String s2 = "300";
		System.out.println(s1+s2);
		
		float f1 = Float.parseFloat(s1);
		float f2 = Float.parseFloat(s2);
		System.out.println(f1+f2);
		
		Float.valueOf(f1);
		Float.valueOf(f2);
		
		int p1 = Integer.parseInt(s1);
		int p2 = Integer.parseInt(s2);
		System.out.println(p1+p2);
		
		Integer.valueOf(p1);
		Integer.valueOf(p2);
	}

}
