import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Denys Gugushkin on 31.03.2017.
 */
public abstract class Base {

    public static WebDriver getDriver(){
        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
        return new FirefoxDriver();
    }

}
