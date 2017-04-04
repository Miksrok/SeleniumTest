package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;


/**
 * Created by Denys Gugushkin on 03.04.2017.
 */
public class AdminPage {

    private WebDriver driver;
    private List<String> menuItemsId = Arrays.asList("subtab-AdminParentOrders",
            "subtab-AdminCatalog",
            "subtab-AdminParentCustomer",
            "subtab-AdminParentCustomerThreads",
            "subtab-AdminStats",
            "subtab-AdminParentModulesSf",
            "subtab-AdminParentThemes",
            "subtab-AdminParentShipping",
            "subtab-AdminParentPayment",
            "subtab-AdminInternational",
            "subtab-ShopParameters",
            "subtab-AdminAdvancedParameters",
            "tab-AdminDashboard");

    public AdminPage (WebDriver driver){
        this.driver = driver;
    }

    public LoginPage logout() throws InterruptedException {
        Thread.sleep(30000);
        driver.findElement(By.id("employee_infos")).click();
        Thread.sleep(10000);
        driver.findElement(By.id("header_logout")).click();
        return new LoginPage(driver);
    }

    public void clickMenuItemsAndRefreshPage() throws InterruptedException {
        String text;
        for (String id : menuItemsId){
            Thread.sleep(30000);
            if (id.equals("subtab-AdminParentCustomer")){
                driver.findElement(By.xpath("//nav/ul/li[5]")).click();
            }else if(id.equals("subtab-AdminParentThemes")){
                driver.findElement(By.xpath("//nav/ul/li[10]")).click();
            }else{
                driver.findElement(By.id(id)).click();
            }


            Thread.sleep(20000);
            if (id.equals("subtab-AdminCatalog")){
                text = driver.findElement(By.className("header-toolbar"))
                        .findElement(By.className("title"))
                        .getText();
            }else if(id.equals("subtab-AdminParentModulesSf")) {
                text = driver.findElement(By.className("header-toolbar"))
                        .findElement(By.className("title"))
                        .getText();
            }else {
                text = driver.findElement(By.className("page-title")).getText();
            }
            
            System.out.println(text);
            driver.navigate().refresh();
            Thread.sleep(20000);
            System.out.println(isCurrentPage(text, id));
        }
    }
    boolean isCurrentPage(String text, String id){
        if (id.equals("subtab-AdminCatalog")){
            String tmp = driver.findElement(By.className("header-toolbar"))
                    .findElement(By.className("title"))
                    .getText();
            return text.equals(tmp);
        }else if(id.equals("subtab-AdminParentModulesSf")){
            String tmp = driver.findElement(By.className("header-toolbar"))
                    .findElement(By.className("title"))
                    .getText();
            return text.equals(tmp);
        }else{
            String tmp = driver.findElement(By.className("page-title"))
                    .getText();
            return text.equals(tmp);
        }
    }
}
