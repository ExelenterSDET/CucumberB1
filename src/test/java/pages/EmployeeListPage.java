package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeListPage {
    @FindBy(id = "empsearch_id")
    public WebElement employeeIdSearchField;
    /*
     empID: <== DON'T NAME LIKE THIS. VAGUE. This gives wrong impression that it's actual
     employee ID, not id-search-field.
     */

    @FindBy(id = "empsearch_employee_name_empName")
    public WebElement employeeNameSearchField;

    @FindBy(id = "searchBtn")
    public WebElement empListSearchButton;
}
