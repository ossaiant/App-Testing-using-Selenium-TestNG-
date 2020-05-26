package testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApplicationTest {
	
	    @BeforeTest
	    public void BeforeTest() {
		System.out.println("Before executing Test");
		//open browser
		{
		}
		}
		@AfterTest
		public void AfterTest() {
			System.out.println("After executing Test");
			//close broswer
			}
				@BeforeMethod
				public void beforeMethod() {
					System.out.println("Before executing Test");
				}
			    @AfterMethod
			    public void afterMethod() {
				System.out.println("After executing Test");
	}
	
	@Test(priority=1)
	public void doLogin() {
		//WebDriver code
		System.out.println("Login Test");
		//throw new SkipException("Login Test");
	}
	
	@Test(priority=2)
	public void DoPasswordChange() {
	System.out.println("Changing Password");
	

}
     @Test(priority=3)
     public void EnterUser() {
	 System.out.println("Enter Username");
}

     @Test(priority=4)
     public void Logout() {
    	 System.out.println("Logging out");
     }
	@Test(priority=5)
	public void EnterUrl() {
		System.out.println("EnterUrl");
	}
}