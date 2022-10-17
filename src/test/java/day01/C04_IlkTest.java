package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_IlkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        /*
        1. Amazon sayfasına gidin
        2. Başlığın "Amazon" içerdiğini test edin
        3. Url'in "amazon" içerdiğini test edin
        4. Sayfayı kapatın
         */
        // 1. Amazon sayfasına gidin
        driver.get("https://amazon.com");

        // 2. Başlığın "Amazon" içerdiğini test edin.
        String actualTitle= driver.getTitle();
        String istenenKelime="Amazon";
        if (actualTitle.contains(istenenKelime)){
            System.out.println("Title Test PASSED");
        } else System.out.println("Title Test FAILURE");

        // 3. Url'in amazon içerdiğini test edin
        String actualUrl=driver.getCurrentUrl();
        String arananKelime="amazon";
        if (actualUrl.contains(arananKelime)){
            System.out.println("Url Test PASSED");
        } else System.out.println("Url Test FAILURE");

        // 4. sayfayı kapatın
        driver.close();
    }
}
