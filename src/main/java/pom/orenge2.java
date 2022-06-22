
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



import reuseablePackage.feature.AllActions;


public class orenge2 {

// public WebDriver driver=null;
// public orenge2 (WebDriver driver)
// 	{
// 		this.driver = driver;

//     }
    
ThreadLocal<WebDriver> driver;
	 	public orenge2 (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	


@FindBy(xpath="//input[@id='txtUsername']")public WebElement txtUsername6;

@FindBy(xpath="//input[@id='btnLogin']")public WebElement Submit8;

@FindBy(xpath="//input[@id='txtPassword']")public WebElement txtPassword15;






//pomStart
	


}
