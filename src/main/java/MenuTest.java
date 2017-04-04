import pages.AdminPage;
import pages.LoginPage;


/**
 * Created by Denys Gugushkin on 02.04.2017.
 */
public class MenuTest extends Base {

    public static void main(String[] args) throws InterruptedException {

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.openLoginPage();
        AdminPage adminPage = loginPage.login("webinar.test@gmail.com", "Xcg7299bnSmMuRLp9ITw");
        adminPage.clickMenuItemsAndRefreshPage();

    }

}
