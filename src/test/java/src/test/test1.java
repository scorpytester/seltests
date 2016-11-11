package src.test;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class test1 {
     private WebDriver driver;
     
     @Before
      public void setUp() {
        driver = new FirefoxDriver();
        new WebDriverWait(driver, 4);
        driver.get("https://www.agl.com.au/residential");
      }
      @After
      public void tearDown() throws IOException {
        driver.quit();
      } 
 
      
	@Test
      public void pageTitleAfterSearchShouldBeginWithDrupal() throws IOException {
		
		driver.findElement(By.xpath(".//*[@id='SearchString']")).sendKeys("residential");
		String h = driver.findElement(By.xpath(".//*[@id='globalHeaderNav']/ul/li[1]/a")).getText();
		System.out.println(h);
        
            }
      }
    

