package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * Created by Denys Gugushkin on 03.04.2017.
 */
public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void openLoginPage(){
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0");
    }

    public AdminPage login(String login, String password){
        driver.findElement(By.id("email")).sendKeys(login);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.name("submitLogin")).click();
        return new AdminPage(driver);
    }


}
