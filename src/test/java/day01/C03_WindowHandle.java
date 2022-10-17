package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        /*
        1. Amazon sayfasina gidiniz.
        2. Basligin "Amazon" icerdigini test ediniz
        3. Url"in amazon icerdigini test ediniz
        4. Sayfayi kapatiniz.
         */

        // 1. Amazon sayfasina gidiniz.

        driver.get("https://amazon.com");

        // 2. Basligin "Amazon" icerdigini test ediniz
        String actualTitle= driver.getTitle();
        String istenenKelime="Amazon";
        if (actualTitle.contains(istenenKelime)){
            System.out.println("Title Test PASSED");
        } else System.out.println("Title Test FAILED");

        // 3. Url"in amazon icerdigini test ediniz
            String actualUrl= driver.getCurrentUrl();
            String arananKelime="amazon";
            if (actualUrl.contains(arananKelime)){
                System.out.println("Url Test PASSED");
            } else System.out.println("Url Test FAILED");

        // 4. Sayfayi kapatiniz.
           driver.close();



    }
}
