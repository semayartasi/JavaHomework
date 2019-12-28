package homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector1 {
    /**
     * Open "https://ultimateqa.com/complicated-page/"
     * find "Skills Improved:" using css selectors and validate text
     * find "How to deal with a large page that has many elements and divisions?" using css selector and validate it
     * find "Properly structuring your page objects" using css selector and validate it
     * */
    public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get( "https://ultimateqa.com/complicated-page/" );
        driver.manage().window().maximize();
        WebElement text1=driver.findElement( By.xpath("//*[contains(text(),'Skills Improved:')]") );
        System.out.println(text1);
        System.out.println(" 'Skills Improved' verified");

        WebElement text2=driver.findElement( By.xpath("//*[contains(text(),'How to deal with a large page that has many elements and divisions?')]") );
        System.out.println(text2);
        System.out.println(" 'How to deal with a large page that has many elements and divisions?' verified");

        WebElement text3=driver.findElement( By.xpath("//*[contains(text(),'Properly structuring your page objects')]") );
        System.out.println(text3);
        System.out.println(" 'Properly structuring your page objects' verified");


        driver.quit();
    }
}
