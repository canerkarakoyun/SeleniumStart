package day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        // Amazon sayfasına gidelim
        driver.get("https://amazon.com");

        //Sayfanın konumunu ve boyutlarını yazdırın
        System.out.println("Sayfanın Pozisyonu: "+driver.manage().window().getPosition());
        System.out.println("Sayfanın Boyutları: "+driver.manage().window().getSize());

        // Sayfanın konumunu ve pozisyonunu istediğiniz şekilde ayarlayın
        driver.manage().window().setPosition(new Point(20,20)); // Sayfanın konumunu istediğimiz şekilde ayarlar
        driver.manage().window().setSize(new Dimension(600,300)); // Sayfanın ölçülerini istediğimiz şekilde ayarlar

        // Sayfanın sizin istediğiniz konum ve pozisyona geldiğini test edin
        System.out.println("Sayfanın Yeni Pozisyonu: "+driver.manage().window().getPosition());
        System.out.println("Sayfanın Yeni Boyutları: "+driver.manage().window().getSize());

        // Sayfayı kapatın
        Thread.sleep(2000);
        driver.close();
    }
}
