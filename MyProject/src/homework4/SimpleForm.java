package homework4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleForm {
    /**
     * open "https://ultimateqa.com/filling-out-forms/"
     * fill in et_pb_contact_form_0 with some random data
     * click on submit button of this form
     * check that text "Form filled out successfully" is displayed
     **/
    public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get( "https://ultimateqa.com/filling-out-forms/" );
        driver.manage().window().maximize();
        driver.findElement(By.id("et_pb_contact_name_0")).sendKeys("Tom");
        driver.findElement(By.id("et_pb_contact_message_0")).sendKeys("Tom");
        driver.findElement(By.xpath("//button[@class='et_pb_contact_submit et_pb_button']")).click();
        driver.findElement(By.xpath("//button[@class='et_pb_contact_submit et_pb_button']")).click();
        driver.findElement(By.xpath("//button[@class='et_pb_contact_submit et_pb_button']")).click();


    }
}
