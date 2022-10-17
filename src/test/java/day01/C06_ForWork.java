package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_ForWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // 1. Trendyol sayfasına git
        driver.get("https://trendyol.com");

        // 2. Sayfa başlığını yazdır
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);

        // 3. Sayfa başlığının "Trenyol" içerdiğini test et
        String istenenKelime="Trendyol";
        if (actualTitle.contains(istenenKelime)){
            System.out.println("Title Test PASSED");
        } else System.out.println("Title Test FAILED");

        // 4. Sayfa Url'ini yazdır
        String actualUrl=driver.getCurrentUrl();
        System.out.println(actualUrl);

        // 5. Sayfa Url'inin "trenyol" içerdiğini test et
        String arananKelime="trendyol";
        if (actualUrl.contains(arananKelime)){
            System.out.println("URL Test PASSED");
        } else System.out.println("URL Test FAILED");

        // 6. Sayfa handle değerlerini yazdır
        System.out.println(driver.getWindowHandle());

        // 7. Sayfaime HTML kodlarında "Gateway" kelsi geçtiğini test et
        String kaynaktaAra="Gateway";
        if (driver.getPageSource().contains(kaynaktaAra)){
            System.out.println("Source Test PASSED");
        } else System.out.println("Source Test FAILED");

        // 8. Sayfayı kapat.
        driver.close();
    }
}
