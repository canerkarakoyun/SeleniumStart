package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_Navigate {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://amazon.com");
        // driver.navigate().to() methodu sayfada ileri geri yapacaksak kullanılır.
        // driver.get() methodu gibi bizi istediğimiz Url'e götürür
        driver.navigate().to("https://techproeducation.com");
        // Tekrar amazon sayfasına dönelim
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().back();
        // Tekrar techpro sayfasına gidelim
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.navigate().forward();

        // Techpro sayfasını yenileyelim
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().refresh();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }
}
