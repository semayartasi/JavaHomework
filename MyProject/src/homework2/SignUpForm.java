package homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SignUpForm {
    /**
     * open SignUpForm.html
     * fill in your data inside the all input elements
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty( "webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get( "file:///C:/Users/semay/IdeaProjects/SeleniumHomework/src/homework1/SignUpForm.html" );
        driver.manage().window().maximize();
         driver.findElement( By.name( "username" ) ).sendKeys("Sema");
        driver.findElement( By.name( "password" ) ).sendKeys("******");
        driver.findElement( By.name( "password_repeat" ) ).sendKeys("******");
        driver.findElement( By.name( "address" ) ).sendKeys("Brooklyn");

        List<WebElement> radio = driver.findElements( By.name( "radio" ) );
        WebElement firstElementOfRadio = radio.get( 0 );
        firstElementOfRadio.click();

        WebElement select = driver.findElement( By.name( "select" ) );
        Select dropdown = new Select( select );
        dropdown.selectByIndex( 1 );

        driver.findElement( By.name( "checkbox" ) ).click();

        driver.findElement( By.name( "image" ) ).click();


        Thread.sleep(1000);

        driver.quit();
    }
}
