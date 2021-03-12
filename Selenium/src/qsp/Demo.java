package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test(priority=1,invocationCount=3)
public void createcustomer() {
    Reporter.log("createcustomer",true);	
}
	@Test(priority=1,dependsOnMethods="createcustomer")
	public void modifycustomer() {
	    Reporter.log("modifycustomer",true);	
	}
	@Test(priority=1)
	public void deletecustomer() {
	    Reporter.log("deletecustomer",true);	
	}
}
