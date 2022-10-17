package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        // Amazon sayfasina gidiniz
        driver.get("https://amazon.com");


        driver.getPageSource();
        String istenenKelime="Gateway";

        if (driver.getPageSource().contains(istenenKelime)){
            System.out.println("PageSource Test PASSED");
        } else
            System.out.println("PageSource Test FAILED");

        driver.close(); // acilan sayfayi kapatir
        // driver.quit(); // acik olan tum chrome sayfalarini kapatir
    }
}
