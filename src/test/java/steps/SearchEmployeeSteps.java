package steps;

import base.BaseClass;
import io.cucumber.java.en.*;
import utils.ConfigsReader;

public class SearchEmployeeSteps extends BaseClass {
    String expectedEmployeeId = "0909";
    String expectedEmployeeName = "Zeynep Demir";
    @Given("user is on the Exelenter homepage")
    public void user_is_on_the_exelenter_homepage() {
        setUp();
    }

    @Given("user logs in with valid admin credentials")
    public void user_logs_in_with_valid_admin_credentials() {
        loginPage.loginToWebsiteViaConfigs("username", "password");
    }

    @Given("user navigates to the employee list page")
    public void user_navigates_to_the_employee_list_page() {
        pimPage.navigateToEmployeeList();
    }

    @Given("user enters an existing employee id in the id-search-field")
    public void user_enters_an_existing_employee_id_in_the_id_search_field() {
        wait(1);
        employeeListPage.searchEmployeeById(expectedEmployeeId);
    }

    @When("user clicks on the search button")
    public void user_clicks_on_the_search_button() {
        click(employeeListPage.empListSearchButton);
    }

    @Then("the employee information is displayed on the employee list table")
    public void the_employee_information_is_displayed_on_the_employee_list_table() {
        System.out.println("Employee info is displayed");
        tearDown();
    }

    @Given("user enters an existing employee name in the employee name-search-field")
    public void user_enters_an_existing_employee_name_in_the_employee_name_search_field() {
        wait(1);
        employeeListPage.searchEmployeeByName(expectedEmployeeName);
    }

}
