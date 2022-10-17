package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class SinifCalismasi {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a. http://a.testaddressbook.com adresine gidiniz.
        b. Sign in butonuna basin
        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
        e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        3. Sayfada kac tane link oldugunu bulun.
         */

        // a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
        // b. Sign in butonuna basin
        driver.findElement(By.id("sign-in")).click();
        // c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTexBox=driver.findElement(By.id("session_email"));
        WebElement password=driver.findElement(By.id("session_password"));
        WebElement signin=driver.findElement(By.name("commit"));
        // d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        // i. Username : testtechproed@gmail.com
        // ii. Password : Test1234!
        emailTexBox.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        signin.click();
        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).

        // 1. Yontem
        WebElement expectedUser= driver.findElement(By.className("navbar-text"));
        if (expectedUser.isDisplayed()){
            System.out.println("ExpectedUser Test PASSED"+" "+expectedUser.getText());
        } else System.out.println("ExpectedUser Test FAILED");

        //--------------------
        // 2. Yontem
        String expectedUserYazisi="testtechproed@gmail.com";
        String actualExpectedUser=expectedUser.getText();
        if (expectedUserYazisi.equals(actualExpectedUser)){
            System.out.println("ExpectedUser Test PASSED "+expectedUser.getText());
        } else System.out.println("ExpectedUser Test FAILED");

         /*
         Bir Webelementin üzerindeki yaziyi konsolda yazdırabilmek için getText() methodu kullanılır
         */

        // f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement addresses = driver.findElement(By.linkText("Addresses"));
        WebElement signOut = driver.findElement(By.linkText("Sign out"));
        if (addresses.isDisplayed()){
            System.out.println("Addresses Test PASSED");
        } else System.out.println("Addresses Test FAILED");

        if (signOut.isDisplayed()){
            System.out.println("SignOut Test PASSED");
        } else System.out.println("SignOut Test FAILED");

        // 3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linklerListesi=driver.findElements(By.tagName("a"));
        System.out.println("Linklerin Sayisi: "+linklerListesi.size());
        System.out.println(linklerListesi);

        // 4. Sayfadaki linkleri yazdirin
        for (WebElement each:linklerListesi) {
            System.out.println("Linkler: "+each.getText());
        }

        // 5. Linkleri lambda ile yazdirin

        linklerListesi.forEach(t-> System.out.println("Linkler lamda: "+t.getText()));

        Thread.sleep(2000);
        driver.close();
    }
}
