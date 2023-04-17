package DAY_9;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class task_1 {
	int c;
  @Test(dataProvider = "dp")
  public void Add(Integer n, Integer m) {
	  c=n+m;
	  System.out.println("sum="+c);
  }

  @Test(dataProvider = "dp")
  public void Sub(Integer n, Integer m) {
	  c=n-m;
	  System.out.println("difference="+c);
  }
  
  @Test(dataProvider = "dp")
  public void Mul(Integer n, Integer m) {
	  c=n*m;
	  System.out.println("product="+c);
  }
  
  @Test(dataProvider = "dp")
  public void Div(Integer n, Integer m) {
	  c=n/m;
	  System.out.println("quotient="+c);
  }
  
  
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, 4 },
      new Object[] { 2, 7 },
    };
  }
}
