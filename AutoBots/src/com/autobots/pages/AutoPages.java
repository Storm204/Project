package com.autobots.pages;

import java.util.List;

import org.dom4j.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoPages
{

	 public WebDriver driver;
	   
	   public AutoPages(WebDriver driver)
      {

		   this.driver = driver;
	   }
	   
	   public boolean Visibility(String xPath)
		{
			try 
			{
				WebDriverWait wait = new WebDriverWait(driver,20);
			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.exit(0);
			}
			return true;
		}
	   

public void Click(String xPath)
     {
	System.out.println(xPath);       
	//if(Visibility(xPath))
	           driver.findElement(By.xpath(xPath)).click();
     }

public void SendValues(String value , String xPath)
{
	//if(Visibility(xPath))
	   driver.findElement(By.xpath(xPath)).sendKeys(value);
}

public void Clear(String xPath)
{
	if(Visibility(xPath))
		driver.findElement(By.xpath(xPath)).clear();
}

public void DropDown(String xPath, String value)
{
	if(Visibility(xPath))
	{
	Select City= new Select(driver.findElement(By.xpath(xPath)));
  City.selectByValue(value); 
	}
}

public void CheckBox(String xPath)
{
	if(Visibility(xPath))
	{ 
	List<WebElement> check = driver.findElements(By.xpath(xPath));
	 check.get(0).click();
	}
}

public void dateSelector(String xPath, String data)
{
	WebElement dateWidget = driver.findElement(By.xpath(xPath));
	List<WebElement> columns=dateWidget.findElements(By.tagName(""));

	for (WebElement cell: columns)
	{
	   if (cell.getText().equals(data))
	   {
	      cell.findElement(By.linkText(data)).click();
	      break;
	 }
 }
}

public String getXpath(Document document, String xmlXPath)
{
	
	//System.out.println(driver.findElement(By.id(document.selectSingleNode(xmlXPath).getText())).toString());
	return driver.findElement(By.xpath(document.selectSingleNode(xmlXPath).getText())).toString();

}

public String getXmlValue(Document document,String xml)
{
	return document.selectSingleNode(xml).getText();
}

public void countadult()
{
	int adult=0;
for(int i=1;i<=2;i++)
{
		adult=adult+1;
}
System.out.println("Adults are: "+adult);
}
}

