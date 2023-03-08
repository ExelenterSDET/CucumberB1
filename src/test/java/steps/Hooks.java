package steps;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before                           // Before annotation (from Cucumber, not JUnit) will run before every Scenario
    public void startBrowser() {
        BaseClass.setUp();
    }
    @After
    public void quitBrowser() {
        BaseClass.tearDown();
    }
}
