package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class BaseTest {
    public WebDriver driver; // Create the driver once here. All classes that inherits BaseTest will automatically have access to the driver.

    public String baseUrl = "https://www.statefarm.com/"; // The base url of the application.
    public void setUp(String url){ // Call setUp method in the BeforeSuit of each new test file.
        driver = new ChromeDriver();
        navigate(url);
        waitForPageToLoad();
    }

    public  void tearDown(){ // Call tearDown method in the AfterSuite of each test file. This will close and quit the browser in the system.
        driver.close();
        driver.quit();
    }

    public void navigate(String url) { // When url parameter value is passed when calling this method or setUp method, browser will add the value at the end of the base url
        String fullUrl = baseUrl + url;
        System.out.println("Browser is navigating to the this url ---> " + fullUrl);
        driver.get(fullUrl);
    }

    public void waitForPageToLoad() {
        Boolean wait = new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(new ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor) driver).executeScript(
                                "return document.readyState"
                        ).equals("complete");
                    }
                });
    }

}
