package home;
import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePO extends BaseTest { // All the page object locators of Home page should be stored in this file.
    public WebElement newsLink() {
        return driver.findElement(By.xpath("(//a[@class=\"nav-link \"])[1]"));
    }

    public WebElement zipCodefield() { return  driver.findElement(By.xpath("//*[@id=\"oneX-findAnAgentZipCode\"]"));}
}
