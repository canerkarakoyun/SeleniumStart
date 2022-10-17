package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Ilkclass {
    public static void main(String[] args) {
        /*
        En temel haliyle bir otomasyon yapmak icin
        Class'larimiza otomasyon icin gerekli olan webbrowser'in yerini gostermemiz gerekir
        bunun icin Java kutuphanesinde System.setPropety() methodunu kullaniriz
        ve method'un icine ilk olarak driver'i yazariz. Ikinci olarak da onun fiziki yolunu kopyalariz
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");

        System.out.println("Actual Title: "+driver.getTitle()); //Gidilen sitenin basligini yazdirir
        System.out.println("Actual Url: "+driver.getCurrentUrl()); // Gidilen sayfanin URL'ini getirir
        System.out.println(driver.getPageSource());
    }
}
