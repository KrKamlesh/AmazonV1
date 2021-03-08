package Mavendemotest.Amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamsungSearch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung mobile phone");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		List<WebElement> wel = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        List actualist=new ArrayList();
		for (int i = 0; i < wel.size(); i++) {
			String data=wel.get(i).getText();
			actualist.add(data);
		}
		Collections.sort(actualist);
		System.out.println(actualist);
		
		XSSFWorkbook workboook = new XSSFWorkbook();
		XSSFSheet sheet = workboook.createSheet("Samsung price");
		
		int rows = wel.size();
		//int cols = empdata[0].length;
				
		
      
      driver.close();
    
	}

}
