package collection;

public class Emp 
{
	private int eno;
	private String ename;
	
	public Emp(int eno, String ename) 
	{
		super();
		this.eno = eno;
		this.ename = ename;
	}
	
	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public void display()
	{
		System.out.println("EMPID : " + eno + "ENAME : "+ ename);
	}


	public static void main(String[] args) 
	{
		Emp e = new Emp(1744, "ravilella");
		System.out.println(e.getEno());
		System.out.println(e.getEname());
		
		System.out.println("-----------------");
		e.display();
	}

}
