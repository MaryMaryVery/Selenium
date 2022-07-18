package Onliner;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.Robot;


import java.awt.*;
import java.awt.event.KeyEvent;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OnlinerChrome {
    public static WebDriver driver = null;
    private final String baseUrl = "https://www.onliner.by";

    @Test
    @Order(1)
    public void openBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/selenium driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        Thread.sleep(5000);

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



   /* @Test
    @Order(3)
    public void gotoLink() throws InterruptedException {
        driver.get("https://profile.onliner.by/registration");
        Assertions.assertTrue(driver.getTitle().toUpperCase()
                .contains("Зарегистрироваться на Onliner".toUpperCase()));
        Thread.sleep(5000);
    }
*/

    @Test
    @Order(4)
    public void signIn() throws InterruptedException {
        WebElement email = driver.findElement(By.id("//*[@id=\"auth-container\"]/div/div[2]/div/form/div[1]/div/div[2]/div/div/div/div/input"));
        email.sendKeys("MaryMaryVery"); //МОЖНО В СКОБКАХ generate (для генерации случ.строки, 6 тест)
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("seledkasmolokom28");
        WebElement button = driver.findElement(By.xpath("//*[@id='register-button']"));
        button.click();
        Thread.sleep( 5000 );
    }

}

  /*  @Test
    @Order(5)
    public void signOut(){
        driver.get(baseUrl+"sign-out");
        Assertions.assertTrue(driver.getTitle().toUpperCase()
                .contains("Stock images".toUpperCase()));
    }


    @Test
    @Order(5)
    public String generate(){
        String s = "";
        Random random = new Random();
        for (int i=0; i<4; i++){
            int n = random.nextInt(127-97+1)+97;
            char c =(char)n;
            s+=c;
        }

        int number = random.nextInt(1000)+1000;
        s+=String.valueOf(number);
        s+="@gmail.com";
        return s;


    }
*/

