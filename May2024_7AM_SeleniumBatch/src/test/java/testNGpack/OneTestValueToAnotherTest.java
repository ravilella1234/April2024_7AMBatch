package testNGpack;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class OneTestValueToAnotherTest 
{
	
  @Test
  public void f1(ITestContext context) 
  {
	  String id = "RRR999";
	  System.out.println("From f1 : " + id);
	  context.setAttribute("id Value", id);
  }
  
  @Test
  public void f2(ITestContext context) 
  {
	  String id = (String)context.getAttribute("idValue");
	  System.out.println("From f1 : " + id);
  }
  
}
