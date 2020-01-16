package tests;

import constants.URLs;
import framework.browser.Browser;
import framework.utils.PropertiesRead;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

abstract public class BaseTest {
    @BeforeTest
    public void init() {
        PropertyConfigurator.configure(PropertiesRead.readFromFrameworkConfig("logfile"));
        Browser.getBrowser();
        Browser.setImplicitlyWait();
        Browser.goToUrl(URLs.VK_COM);
        Browser.maximize();
    }

    @AfterMethod
    public void close() {
        Browser.close();
    }
}
