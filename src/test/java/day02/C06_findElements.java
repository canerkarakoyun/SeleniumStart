package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C06_findElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon sayfasına gidin
        driver.get("https://amazon.com");

        // Amazon sayfasındaki tag'ları a olanların (linklerin) sayısını yazdırın
        List<WebElement> tag=driver.findElements(By.tagName("a"));
        System.out.println("a tag'ının sayısı: "+tag.size());

        // Browser'ı kapat
        driver.close();

    }
}
