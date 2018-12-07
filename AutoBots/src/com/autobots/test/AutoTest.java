package com.autobots.test;

import java.io.File;
import java.io.FileInputStream;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.autobots.pages.AutoPages;



public class AutoTest {
	
	WebDriver driver;
	
	@BeforeClass
	public  void ChromeStart()
	{
		System.setProperty("webdriver.chrome.driver","D:/Users/ADM-IG-HWDLAB1B/Downloads/chromedriver_win32/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.goibibo.com/");
	}
	
	/*public  void FirefoxStart()
	{
		driver= new FirefoxDriver();
		driver.get("https://www.goibibo.com/");
	}*/
	
	
	@Test
	  public void testMethod() throws Exception
	  {
	   
		AutoPages p = PageFactory.initElements(driver, AutoPages.class);

	    /*----------------Read From Xml File------------------------------------------*/ 
		
		File src= new File("D:/dataservlet3.0/AutoBots/Config/AutoResult.xml");
		FileInputStream fis = new FileInputStream(src);
		
		SAXReader saxreader = new SAXReader();
		Document document = saxreader.read(fis);
		
		String xmlPath="//goibibo/path/from";
		String xmlData="//goibibo/data/from";
		String xmlPath1="//goibibo/path/to";
		String xmlData1="//goibibo/data/to";
		String xmlPath2="//goibibo/path/openCalendar";
		String xmlPath3="//goibibo/path/dateSelector";
		String xmlPath4="//goibibo/path/openreturnCalendar";
		String xmlPath5="//goibibo/path/selectReturnDate";
		String xmlPath6="//goibibo/path/Traveller";
		String xmlPath7="//goibibo/path/plus";
		String xmlPath8="//goibibo/path/Cplus";
		
	    
		
		p.Click(document.selectSingleNode("//goibibo/path/roundtrip").getText());
		Thread.sleep(1000);
	    p.SendValues(p.getXmlValue(document, xmlData),p.getXmlValue(document, xmlPath));
	    Thread.sleep(1000);
	    p.SendValues(p.getXmlValue(document, xmlData1),p.getXmlValue(document, xmlPath1));
	    Thread.sleep(1000);
	    p.Click(document.selectSingleNode(xmlPath2).getText());
	   Thread.sleep(1000);
	   p.Click(document.selectSingleNode(xmlPath3).getText());
	   Thread.sleep(1000);
	   p.Click(document.selectSingleNode(xmlPath4).getText());
	   Thread.sleep(1000);
	  p.Click(document.selectSingleNode(xmlPath5).getText());
	   Thread.sleep(1000);
	   p.Click(document.selectSingleNode(xmlPath6).getText());
	   Thread.sleep(1000);
	  p.Click(document.selectSingleNode(xmlPath7).getText());
	   Thread.sleep(1000);
		//System.out.println("count is:"+count(xmlPath7));
	   p.Click(document.selectSingleNode(xmlPath8).getText());
	   Thread.sleep(1000);
	   p.DropDown(document.selectSingleNode("//goibibo/path/Class").getText(), "B");
	   Thread.sleep(1000);
	   p.Click(document.selectSingleNode("//goibibo/path/pricechange").getText());
	   Thread.sleep(1000);
	   p.Click(document.selectSingleNode("//goibibo/path/setgo").getText());
	   Thread.sleep(1000);
	   p.Click(document.selectSingleNode("//goibibo/path/Tbook").getText());
	   Thread.sleep(1000);
	   p.countadult();
	 //  p.count(xmlPath7);
	   //System.out.println( p.count(xmlPath7));
	   
	   
	  
     }
	
	private String count(String xmlPath7) 
	{
		// TODO Auto-generated method stub
		return null;
			//return +count("xmlPath7");
	}

	@AfterClass
	public void Last() throws InterruptedException
	{
		Thread.sleep(4000);
		//driver.close();
	}
	
}
