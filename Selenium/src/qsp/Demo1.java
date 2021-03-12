package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void createcustomer() {
	    Reporter.log("createcustomer",true);	
	}
		@Test
		public void modifycustomer() {
		    Reporter.log("modifycustomer",true);	
		}
		@Test
		public void deletecustomer() {
		    Reporter.log("deletecustomer",true);	
		}
}
