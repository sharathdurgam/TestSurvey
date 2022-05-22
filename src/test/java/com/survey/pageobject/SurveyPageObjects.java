package com.survey.pageobject;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SurveyPageObjects {
	public static  WebDriver driver;
	
	@FindBy(how =  How.XPATH,  using =  "//button[@id=\"startSurvey\"]")
	private  WebElement btnServeyStart;
	
	@FindBy(how= How.XPATH,using = "//*[@id=\"surveyLayout\"]/div/div/div[2]/div/div/div/p/p")
	private WebElement welcomeText;
	
	@FindBy(how = How.XPATH,using = "(//div[@class='qRadioDisplay'])[3]")
    private WebElement clickRadioButton;
	
	
	@FindBy(how = How.ID,using = "nextPage")
	private WebElement nextPage;
	
	@FindBy(how = How.XPATH,using = "//input[@id='gHxfpbAm9vj4uE8kL']")
	private WebElement inputText;
	
	
	@FindBy(how = How.XPATH,using = "//p[text()='Survey Complete']")
	private WebElement surveyComplete;
	
	
	
	Random ran= new Random();
	public  SurveyPageObjects(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	////welcome text 
	public  void verifyWelComeText()
	{
		 ///capture from app  
		 String   textFromApp= welcomeText.getText();
		 if(textFromApp.equalsIgnoreCase("Welcome to the quantilope QA Engineer Case Study!"))
		 {
			 System.out.println("Survey  Page Displayed");
		 }
		 else 
		 {
			 System.out.println("Survey page not displayed");
		}
	}
		
		 //start survey   button  
		 public  void  clickStartSurvey()
		 {
			 btnServeyStart.click();
		 }
		 
		 ///first question random selection  
		 public void  firstQuestionRandomSelection()
		 {
			 int ranNo  = ran.nextInt(3);
			 ////webelement  
			  WebElement anyRadioButtonSelection  = driver.findElement(By.xpath("(//div[@class='qRadioDisplay'])["+ranNo+"]"));
			  anyRadioButtonSelection.click();
		 }
		 
		///Third question random selection  
		 public void  thirdQuestionRandomSelection()
		 {
			 int ranNo  = ran.nextInt(5);
			 ////webelement  
			  WebElement anyRadioButtonSelection  = driver.findElement(By.xpath("(//div[@class='qRadioDisplay'])["+ranNo+"]"));
			  anyRadioButtonSelection.click();
		 }
		 
		 
		 ///next button  
		  public void  clickOnNextButton()
		  {
			  nextPage.click();
		  }
		  
		///Second question enter data    
			 public void  secondQuestionData()
			 {
				 int ranNo  = ran.nextInt(9);
				  String sNO  = String.valueOf(ranNo);
				 inputText.sendKeys(String.valueOf(ranNo));				 
				 
			 }
			 
			 ///verify survey complet  
			  public void  verifySurveyCoplete()
			  {
				  ///text from app  
				  String completeTextMsg  = surveyComplete.getText();
				  if(completeTextMsg.equalsIgnoreCase("Survey Complete"))
				  {
					  System.out.println("Survey is completed");
				  }
				  else {
					  System.out.println("Survey is not complete");
				}
			  }
			
		
		 
		 
	
	
	
}



