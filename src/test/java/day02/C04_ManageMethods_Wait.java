package day02;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_Wait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // bu satırı da alışkanlık haline getirelim
        /*
        Bir sayfa açılırken, ilk başta sayfanın içerisinde bulunan elementlere erişim için
        yükleme süresine ihtiyaç olabilir. Bu zamanın ne kadar olacağını bu method ile belirleyebiliriz.

        Burada belirttiğimiz süre dolduğunda halen sayfa yüklenememişse otomasyonu durdurur. Maximum süre belirler.
         */

        driver.get("https://amazon.com");
        driver.close();
    }
}
