package test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import utils.SingletonWebDriver;
import utils.Utilities;

public abstract class AbstractTest {
    private static WebDriver webDriver;
    private static final String URL = "https://catalog.onliner.by/";

    @Before
    public void openSite() {
        webDriver = SingletonWebDriver.getWebDriver();
        webDriver.get(URL);
    }

    @After
    public void afterTest() {
        Utilities.sleep(1);
        SingletonWebDriver.driverQuit();
    }
}