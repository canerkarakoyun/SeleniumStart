package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://amazon.com");

        // sayfanın konumunu ve boyutlarını yazdırın
        System.out.println("Pencere Konumu: "+driver.manage().window().getPosition()); // Açılan browser'ın konumunu verir
        System.out.println("Pencere Ölçüleri: "+driver.manage().window().getSize()); // Açılan browser'ın ölçülerini verir

        // Sayfayı simge durumuna getirin
        driver.manage().window().minimize();

        // Simge durumunda 3 saniye bekletip sonra sayfayı maximize edin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        // Maximize durumunda sayfanın konumu ve boyutlarını yazdırın
        System.out.println("Maximize konum: "+driver.manage().window().getPosition());
        System.out.println("Maximize boyutlar: "+driver.manage().window().getSize());

        // Sayfayı fullscreen yapın
        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        // Sayfa fullscreen halde iken konumu ve boyutlarını yazdırın
        System.out.println("Fullscreen Pencere Konumu: "+driver.manage().window().getPosition());
        System.out.println("Fullscreen Pencere Boyutları: "+driver.manage().window().getSize());

        // Sayfayı kapatın
        Thread.sleep(3000);
        driver.close();
    }
}
