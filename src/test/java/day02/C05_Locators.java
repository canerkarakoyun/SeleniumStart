package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com");
        driver.navigate().refresh();

        // Amazon'da Nutella aratın
       // WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
       // aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

       // WebElement aramaKutusu= driver.findElement(By.name("field-keywords"));
        // aramaKutusu.sendKeys("Nutella"+Keys.ENTER);

        driver.findElement(By.linkText("Become an Affiliate")).click();

    }
}
