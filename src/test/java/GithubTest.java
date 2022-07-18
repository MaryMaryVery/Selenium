
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.awt.*;
import java.awt.event.KeyEvent;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class GithubTest {
    private static WebDriver driver = null;
    private final String baseUrl="https://www.github.com/";

    @Test
    @Order(1)
    public void openBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/selenium driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        Thread.sleep( 5000 );
    }

    @Test
    @Order(2)
    public void getTitle() throws InterruptedException {
        System.out.println(driver.getTitle());
        Assertions.assertTrue(driver.getTitle().toUpperCase()
                .contains("GitHub".toUpperCase()));
        Thread.sleep( 5000 );
    }

    @Test
    @Order(3)
    public void gotoLink() throws InterruptedException {
        driver.get(baseUrl+"login");
        Thread.sleep( 5000 );
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
    @Test
    @Order(5)
    public void signOut() throws InterruptedException {
        driver.get(baseUrl+"logout");
        WebElement input = driver.findElement(By.xpath("//input[@value='Sign out']"));
        input.click();
        Thread.sleep( 5000 );
    }

}

