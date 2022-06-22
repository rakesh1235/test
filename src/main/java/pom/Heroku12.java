
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



import reuseablePackage.feature.AllActions;


public class Heroku12 {

// public WebDriver driver=null;
// public Heroku12 (WebDriver driver)
// 	{
// 		this.driver = driver;
// 		PageFactory.initElements(AllActions.driver, this);        // Reusable is a Reusable class where we initalize Web Driver ( public static WebDriver driver =null)
//     }
    
ThreadLocal<WebDriver> driver;
	 	public Heroku12 (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	


@FindBy(xpath="//input[@id='username']")public WebElement username1;

@FindBy(xpath="//input[@id='password']")public WebElement password2;

@FindBy(xpath="//button[@class='radius']")public WebElement buttonobj3;



@FindBy(tagName="a")public WebElement remove;
//pomStart
	


}
