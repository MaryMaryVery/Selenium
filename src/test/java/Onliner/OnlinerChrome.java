package Onliner;

import org.checkerframework.common.subtyping.qual.Bottom;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
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
        Thread.sleep(3000);

    }

    @Test
    @Order(2)
    public void getTitle() throws InterruptedException {
        System.out.println(driver.getTitle());
        Assertions.assertTrue(driver.getTitle().toUpperCase()
                .contains("Onliner".toUpperCase()));
        Thread.sleep(3000);
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
    public void signUp() throws InterruptedException {
        WebElement name = driver.findElement(By.xpath("//*[@id='auth-container']/div/div[2]/div/form/div[1]/div/div[2]/div/div/div/div/input"));
        name.sendKeys("kalchenko.marya@gmail.com");
        WebElement password = driver.findElement(By.xpath("//*[@id='auth-container']/div/div[2]/div/form/div[2]/div/div/div/div/input"));
        password.sendKeys("seledkasmolokom");
        Thread.sleep(3000);
    }

    /*
        @Test
        @Order(5)
        public void PressBotton2() throws AWTException, InterruptedException {
            driver.findElement(By.xpath("//*[@id=\"auth-container\"]/div/div[2]/div/form/div[3]/button")).click();
            Robot r = new Robot();
            Robot rr = new Robot();
            rr.keyPress(KeyEvent.VK_ENTER);
            rr.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(5000);


        }
    */
    @Test
    @Order(5)
    public void gotoBel() throws InterruptedException {
        driver.get("https://sp.onliner.by/in_belarusian/");
        Thread.sleep(3000);
    }

    @Test
    @Order(6)
    public void gotoLib() throws InterruptedException {
        driver.get("https://sp.onliner.by/library/");
        Thread.sleep(3000);
    }

    @Test
    @Order(7)
    public void PressBottonDec() throws AWTException, InterruptedException {
        driver.findElement(By.xpath("/html/body/div/section[11]/div/div/ul/li[1]/a/span[2]/span/span[1]")).click();
        Robot r = new Robot();
        Robot rr = new Robot();
        rr.keyPress(KeyEvent.VK_ENTER);
        rr.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
    }



    @Test
    @Order(8)
    public void gotoStart() throws InterruptedException {
        driver.get("https://www.onliner.by/");
        Thread.sleep(3000);
    }

    @Test
    @Order(9)
    public void PressBottonStart() throws AWTException, InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"userbar\"]/div[1]/div/div/div[1]")).click();
        Robot r = new Robot();
        Robot rr = new Robot();
        rr.keyPress(KeyEvent.VK_ENTER);
        rr.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);


    }
    @Test
    @Order(10)
    public void PressReg() throws AWTException, InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"auth-container\"]/div/div[2]/div/form/div[4]/div[1]/a")).click();
        Robot r = new Robot();
        Robot rr = new Robot();
        rr.keyPress(KeyEvent.VK_ENTER);
        rr.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);


    }
    @Test
    @Order(11)
    public void signRegistr() throws InterruptedException {
        WebElement name = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[2]/div/div[5]/div/div/div/div/input"));
        name.sendKeys("123@gmail.com");
        WebElement password = driver.findElement(By.xpath ("//*[@id=\"container\"]/div/div/div/form/div[2]/div/div[6]/div/div/div/div/input"));
        password.sendKeys("marymaryvery1232");
        WebElement password2 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[2]/div/div[8]/div/div/div/div/input"));
        password2.sendKeys("marymaryvery1232");
        driver.findElement(By.xpath("//*[@id=\" container\"]/div/div/div/form/div[2]/div/div[9]/label/span/span[1]")).click();
        Thread.sleep(3000);
    }
}
/*
    @Test
    @Order(5)
    public void PressOut() throws AWTException, InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"navigation-sidebar\"]/div[2]/div[2]/div[3]/div[1]/a")).click();
        Robot r = new Robot();
        Robot rr = new Robot();
        rr.keyPress(KeyEvent.VK_ENTER);
        rr.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);

    }
}
/*

    @Test
    @Order(5)
    public void signOut() {
        driver.get(baseUrl + "sign-out");
        Assertions.assertTrue(driver.getTitle().toUpperCase()
                .contains("Stock images".toUpperCase()));
    }
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

 /* @Test
    @Order(3)
    public void gotoLink() throws InterruptedException {
        driver.get("https://profile.onliner.by/registration");
        Assertions.assertTrue(driver.getTitle().toUpperCase()
                .contains("Зарегистрироваться на Onliner".toUpperCase()));
        Thread.sleep(5000);
    }
*/