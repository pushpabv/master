package com.actitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	private WebElement untbx;
	private WebElement pwtbx;
	private WebElement loginbtn;
	public Loginpage(WebDriver driver) {
		untbx=driver.findElement(By.id("username"));
		pwtbx=driver.findElement(By.name("pwd"));
		loginbtn=driver.findElement(By.xpath("//*[@id=\"loginButton\"]/div"));
	}
public void setuser(String un) {
	untbx.sendKeys("admin");
}
public void setpassword(String pw) {
	pwtbx.sendKeys("manager");
}
public void click() {
	loginbtn.click();
}
 
	

}
