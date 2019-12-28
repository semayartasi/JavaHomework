package homework2;

import com.google.common.base.Splitter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class SignUpFormSubmissionValidation {
    /**
     * open SignUpForm.html
     * store values that you will use inside some Strings
     * fill in your data inside the all input elements using Strings above
     * submit the form
     * get URL
     * parse values that was submitted
     * validate parsed values with stored values above
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
        String currentUrl = driver.getCurrentUrl();
        System.out.println( currentUrl );




        String query = currentUrl.split("\\?")[1];
        final Map<String, String> map = Splitter.on('&').trimResults().withKeyValueSeparator('=').split(query);
        System.out.println(map);




        driver.quit();
    }
}
