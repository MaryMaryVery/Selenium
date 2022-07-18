package Onliner;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OnlinerOpera {
    public static WebDriver driver = null;
    private final String baseUrl = "https://www.onliner.by";


    @Test
    @Order(1)
    public void openBrowser() {
        System.setProperty("webdriver.opera.driver", "D:/selenium driver/operadriver.exe");
        driver = new OperaDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    @Test
    @Order(2)
    public void getTitle() throws InterruptedException {
        System.out.println(driver.getTitle());
        Assertions.assertTrue(driver.getTitle().toUpperCase()
                .contains("Onliner".toUpperCase()));
        Thread.sleep(5000);
    }

    @Test
    @Order(3)
    public void PressBotton() throws AWTException, InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"userbar\"]/div[1]/div/div/div[1]")).click();
        Robot r = new Robot();
        Robot rr = new Robot();
        rr.keyPress(KeyEvent.VK_ENTER);
        rr.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
    }


    @Test
    @Order(4)
    public void signIn() throws InterruptedException {
        WebElement input = driver.findElement(By.id("login_field"));
        input.sendKeys("MaryMaryVery");
        input = driver.findElement(By.id("password"));
        input.sendKeys("seledkasmolokom");
        input = driver.findElement(By.xpath("//input[@name='commit']"));
        input.sendKeys("seledkasmolokom");
        input.click();
        Thread.sleep( 5000 );


    }
}
    /*@Test
    @Order(5)
    public void signOut() {
        driver.get(baseUrl + "sign-out");
        Assertions.assertTrue(driver.getTitle().toUpperCase()
                .contains("Stock images".toUpperCase()));
    }

    @Test
    @Order(6)
    public String generate() {
        String s = "";
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int n = random.nextInt(127 - 97 + 1) + 97;
            char c = (char) n;
            s += c;
        }

        int number = random.nextInt(1000) + 1000;
        s += String.valueOf(number);
        s += "@gmail.com";
        return s;
    }


}*/
