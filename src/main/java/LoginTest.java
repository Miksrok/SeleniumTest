import pages.AdminPage;
import pages.LoginPage;

/**
 * Created by Denys Gugushkin on 31.03.2017.
 */
public class LoginTest extends Base {

    public static void main(String[] args) throws InterruptedException {

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.openLoginPage();
        AdminPage adminPage = loginPage.login("webinar.test@gmail.com", "Xcg7299bnSmMuRLp9ITw");
        adminPage.logout();

    }

}
