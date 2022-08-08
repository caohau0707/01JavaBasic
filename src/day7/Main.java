package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		//submitSucessfully();
		tickonCheckbox();

	}

	public static void submitSucessfully() {
		// Open brower
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/01Tool/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		// Type URL
		driver.get("https://demoqa.com/");
		// Chon element box
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
		driver.findElement(By.xpath("//span[text() ='Text Box']")).click();
		driver.findElement(By.id("userName")).sendKeys("Hau Cao");
		driver.findElement(By.id("userEmail")).sendKeys("test@123gmail.com");
		driver.findElement(By.xpath("//*[@id='currentAddress']")).sendKeys("Current Address");
		driver.findElement(By.xpath("//*[@id='permanentAddress']")).sendKeys("Permanent Address");
		//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//*[@id='submit']")).click();

		String name = driver.findElement(By.id("name")).getText();
		String actualName = name.substring(name.lastIndexOf(":") + 1, name.length());
		System.out.println(actualName);
		if (actualName.equals("Hau Cao")) {
			System.out.println("Test case pass");
		} else {
			System.out.println("Test case fail");
		}
	}

	
	public static void tickonCheckbox() {
		// Open brower
		System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/01Tool/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		// Type URL
		driver.get("https://demoqa.com/");
		// Chon element box
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
		driver.findElement(By.xpath("//span[text() ='Check Box']")).click();
		Boolean isSelected =driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-uncheck']")).isSelected();
		if(isSelected == false) {
			System.out.println("The home checbox is unchecked");
		}
		driver.findElement(By.xpath("//*[@class='rct-node-icon']")).click();
		driver.findElement(By.xpath("//*[@class='text-success']")).getText();
		List<WebElement> listOfElements = driver.findElements(By.xpath("//*[@class='text-success']"));
		String value = "";
		for(int i=0;i<listOfElements.size();i++) {
			value = value + listOfElements.get(i).getText() + " ";
		}
		System.out.println(value);
		if(value.trim().equals("home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile")){
			System.out.print("Text is shown: " + value);
		}
		driver.findElement(By.xpath("//*[@class='rct-collapse rct-collapse-btn']")).click();
		Boolean isDisplayed1 = driver.findElement(By.xpath("//span[text()='Desktop']")).isDisplayed();
		if(isDisplayed1==true) {
			System.out.println("Desktop is displayed");
		}
		System.out.println("Desktop is not displayed");
		
		Boolean isSelected1 = driver.findElement(By.xpath("(//*[@class='rct-icon rct-icon-check'])[2]")).isSelected();
		
		if(isSelected1==true) {
			System.out.println("Desktop is displayed");
		}
		System.out.println("Desktop is not displayed");
		
		Boolean isDisplayed2 = driver.findElement(By.xpath("//span[text()='Documents']")).isDisplayed();
		if(isDisplayed2==true) {
			System.out.println("Documents is displayed");
		}
		Boolean isSelected2 = driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-uncheck']")).isSelected();
		if(isSelected2==true) {
			System.out.println("Documents is selected");
		}
		System.out.println("Documents is not selected");

}}

