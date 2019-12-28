package homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {
    /**
     * Open "http://the-internet.herokuapp.com/login"
     *
     * using XPath:
     *      grab username from first <em> tag and store inside a String
     *      grab password from second <em> tag and store inside a String
     *      fill in username and password inputs with above username and password
     *      find <button> with type="submit" and click it
     *      find and verify text "Welcome to the Secure Area. When you are done click logout below."
     *      find "Log out" button and click it
     *      find and verify text "You logged out of the secure area!"
     * */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty( "webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get( "http://the-internet.herokuapp.com/login" );
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//*[@class='fa fa-2x fa-sign-in']")).click();
        Thread.sleep(1000);
        WebElement text1=driver.findElement( By.xpath("//h4[contains(text(),'Welcome to the Secure Area. When you are done click logout below.')]") );

        System.out.println(" 'Welcome to the Secure Area. When you are done click logout below.' verified");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[@class='button secondary radius']")).click();
        Thread.sleep(1000);

        WebElement text2=driver.findElement( By.xpath("//div[contains(text(),'You logged out of the secure area!')]") );
        System.out.println(" You logged out of the secure area!' verified");

        driver.quit();
    }
}
