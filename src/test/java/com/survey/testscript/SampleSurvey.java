package com.survey.testscript;

import org.testng.annotations.Test;

import com.survey.pageobject.SurveyPageObjects;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SampleSurvey {
	 public static WebDriver driver;

	 
  @Test(priority = 1)
  public void fullSurvey() throws InterruptedException {
		 SurveyPageObjects surveyObj = new  SurveyPageObjects(driver);
	  Thread.sleep(5000);
	  System.out.println("start survey");
	  surveyObj.verifyWelComeText();
	  Thread.sleep(5000);
	  //driver.findElement(By.xpath("//button[@id='startSurvey']")).click();
	  surveyObj.clickStartSurvey();
	  Thread.sleep(5000);
	  surveyObj.firstQuestionRandomSelection();
	  Thread.sleep(5000);
	  surveyObj.clickOnNextButton();
	  Thread.sleep(5000);
	  surveyObj.secondQuestionData();
	  Thread.sleep(5000);
	  surveyObj.clickOnNextButton();
	  Thread.sleep(5000);
	  surveyObj.thirdQuestionRandomSelection();
	  Thread.sleep(5000);
	  surveyObj.clickOnNextButton();
	  Thread.sleep(5000);
	  surveyObj.verifySurveyCoplete();
	  
	  
  }
  @Test(priority = 2)
  public void halfSurvey() throws InterruptedException {
	  SurveyPageObjects surveyObj = new  SurveyPageObjects(driver);
	  Thread.sleep(5000);
	  System.out.println("start survey");
	  surveyObj.verifyWelComeText();
	  Thread.sleep(5000);
	  //driver.findElement(By.xpath("//button[@id='startSurvey']")).click();
	  surveyObj.clickStartSurvey();
	  Thread.sleep(5000);
	  surveyObj.firstQuestionRandomSelection();
	  Thread.sleep(5000);
	  surveyObj.clickOnNextButton();
	
}
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver/chromedriver 3");
	  driver = new ChromeDriver();
	   driver.get("https://survey.quantilope.com/SfidqfGjdrvMzwzWK/ht2c7Ks36eifvDEv9/9xednGW4bJAGd7sv2");
  }

  @AfterMethod
  public void afterMethod()  throws Exception{
	  Thread.sleep(5000);
	  driver.close();
	//  driver.quit();
	  
  }

  @BeforeTest
  public void beforeTest() {
	   System.out.println("execution start  ");
  }

  @AfterTest
  public void afterTest() {
	   System.out.println("execution end ");
  }

}
