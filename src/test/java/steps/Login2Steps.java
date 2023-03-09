package steps;

import base.BaseClass;
import io.cucumber.java.en.*;
import org.junit.Assert;
import utils.ConfigsReader;

public class Login2Steps extends BaseClass {
    @When("admin user logs in with valid credentials")
    public void admin_user_logs_in_with_valid_credentials() {
        //1st way
        loginPage.loginToWebsiteViaConfigs("username", "password");

        //2nd way
//        sendText(loginPage.username, ConfigsReader.getProperties("username"));
//        sendText(loginPage.password, ConfigsReader.getProperties("password"));
//        click(loginPage.loginBtn);

        //3rd way
//        loginPage.username.sendKeys("Admin");  // hardcode
//        loginPage.password.sendKeys(ConfigsReader.getProperties("password")); // from ConfigsReader
//        loginPage.loginBtn.clear();
    }
    @Then("admin user logs in successfully")
    public void admin_user_logs_in_successfully() {
        String expectedMessage = "Welcome Admin";
        String actualMessage = dashboardPage.welcome.getText();
        Assert.assertEquals("Admin user unable to log in",expectedMessage,actualMessage);
    }

    @When("ess user logs in with valid credentials")
    public void ess_user_logs_in_with_valid_credentials() {
        loginPage.loginToWebsiteViaConfigs("essUsername", "essPassword");
    }
    @Then("ess user logs in successfully")
    public void ess_user_logs_in_successfully() {
        String expectedMessage = "Welcome John";
        String actualMessage = dashboardPage.welcome.getText();
        Assert.assertEquals("ESS user unable to log in",expectedMessage,actualMessage);
    }
}
