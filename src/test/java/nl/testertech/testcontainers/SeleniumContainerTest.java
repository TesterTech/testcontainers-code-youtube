package nl.testertech.testcontainers;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testcontainers.containers.BrowserWebDriverContainer;

import java.io.File;

import static org.testcontainers.containers.BrowserWebDriverContainer.VncRecordingMode.RECORD_ALL;

public class SeleniumContainerTest {

    private RemoteWebDriver driver;

    @Before
    public void SeleniumContainerTest(){
        driver = chrome.getWebDriver();
    }

    @Rule
    public BrowserWebDriverContainer chrome =
            new BrowserWebDriverContainer()
                    .withCapabilities(new ChromeOptions().addArguments("--incognito"))
                    .withRecordingMode(RECORD_ALL, new File("./target/"));

    @Test
    public void simplePlainSeleniumTest() throws InterruptedException {
        driver.get("https://www.google.com");
        Thread.sleep(1500);
        VisitAltenWebsite();
    }

    private void VisitAltenWebsite() {
        WebElement element = driver.findElementByName("q");
        element.sendKeys("Alten Nederland");
        element.sendKeys("\n");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
