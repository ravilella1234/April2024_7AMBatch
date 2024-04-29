package hdfc.loans.homeloans;

public class SortArray 
{

	public static void main(String[] args)
	{
		int[] a = {5,3,8,1,7};
		System.out.println("Original Array  :");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
		
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[i]) 
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("Sorted Array  :");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
	}

}
