package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Xpath {
     /*
    1. https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    2- Add Element butonuna basin
    3. Delete butonu’nun gorunur oldugunu test edin
    4. Delete tusuna basin
    5. “Add/Remove Elements” yazisinin gorunur oldugunu test edin

     */
     public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

         //1. https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
         driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
         //2. Add Element butonuna basin
         Thread.sleep(3000);
         driver.findElement(By.xpath("//*[text()='Add Element']")).click();
         //3. Delete butonu’nun gorunur oldugunu test edin
         WebElement deleteButton = driver.findElement(By.xpath("//*[@class='added-manually']"));
         if (deleteButton.isDisplayed()==true){
             System.out.println("Delete Button Test PASSED");
         } else System.out.println("Delete Buttun Test FAILED");
         //4. Delete tusuna basin
         Thread.sleep(3000);
         driver.findElement(By.xpath("//*[@class='added-manually']")).click();
         //5. “Add/Remove Elements” yazisinin gorunur oldugunu test edin
         WebElement addRemoveElement = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
         if (addRemoveElement.isDisplayed()==true){
             System.out.println("Add/Remove Elements Test PASSED");
         } else System.out.println("Add/Remove Elements Test FAILED");
         // 6 sayfayı kapatın
         driver.close();
     }
}
