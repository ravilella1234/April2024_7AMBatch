package hdfc.loans.homeloans;

public class UserDefineArray 
{

	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "s1");
		Student s2 = new Student(2, "s2");
		Student s3 = new Student(3, "s3");
		Student s4 = new Student(4, "s4");
		Student s5 = new Student(5, "s5");

		/*System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);*/
		
		Student[] s = new Student[5];
		s[0]=s1;
		s[1]=s2;
		s[2]=s3;
		s[3]=s4;
		s[4]=s5;
		
		for(Student st:s)
		{
			System.out.println(st);
		}
	}

}
