package componetEcommerce;

/*package com.java.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		GoogleSearch.lauchURL();
		//GoogleSearch.tearDown();
		GoogleSearch.googleSearch();
	}

	public static void lauchURL() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Me\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		}
	public static void googleSearch() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@class ='gLFyf gsfi']")).sendKeys("java");
		Thread.sleep(3000);
		List<WebElement> suggestionLists = driver.findElements(By.xpath("//*[@class = 'erkvQe']//li"));
		int count = suggestionLists.size();
		System.out.println(count);
		Thread.sleep(3000);
		List<WebElement> suggestionListsData = driver.findElements(By.xpath("//*[@class = 'erkvQe']//li/descendant:: div[@class='sbl1']"));
		for(int i = 0; i<suggestionListsData.size(); i++)
		{
			System.out.println(suggestionListsData.get(i).getText());
			if((suggestionListsData.get(i).getText()).equals("java download"))
			{
				suggestionListsData.get(i).click();
			}
		}
	}
	
	public static void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}

}
*/