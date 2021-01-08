package hw6.runtest;

import com.epam.jdi.light.driver.WebDriverUtils;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.init.PageFactory;

import hw6.Site;
import hw6.service.entities.AuxiliaryClass;

import org.testng.annotations.*;

public class CoreTest extends AuxiliaryClass {

    @BeforeMethod(alwaysRun = true)
    public void setupTest() {
        //WebPage.openUrl("https://jdi-testing.github.io/jdi-light/");
        PageFactory.initSite(Site.class);
    }

    @AfterMethod(alwaysRun = true)
    public void teardownTest() {
        WebDriverUtils.killAllSeleniumDrivers();
    }

}