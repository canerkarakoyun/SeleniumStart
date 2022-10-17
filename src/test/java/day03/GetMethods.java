package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetMethods {
    /*
    Amazon sayfasina gidiniz
    Arama kutusunu locate ediniz
    Arama kutusunun tagName'inin input input oldugunu test ediniz
    Arama kutusunun name attribute'unun degerinin "field-keywords" oldugunu test ediniz
    Sayfayi kapatiniz
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon sayfasina gidiniz
        driver.get("https://amazon.com");
        // Arama kutusunu locate ediniz
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        // Arama kutusunun tagName'inin input oldugunu test ediniz
        String expectedTagName="input";
        String actualTagName= aramaKutusu.getTagName();
        if (actualTagName.equals(expectedTagName)){
            System.out.println("TagName Test PASSED");
        } else System.out.println("TagName Test FAILED");

        // Arama kutusunun name attribute'unun degerinin "field-keywords" oldugunu test ediniz
        String expectedAttributeName="field-keywords";
        String actualAttributeName= aramaKutusu.getAttribute("name");
        if (expectedAttributeName.equals(actualAttributeName)){
            System.out.println("Attribute Test PASSED");
        } else System.out.println("Attribute Test FAILED");

        // Arama kutusunun konumunu yazdirin
        System.out.println("Arama Kutusunun Konumu: "+aramaKutusu.getLocation());

        // Sayfayi kapatiniz
        driver.close();
    }
}
