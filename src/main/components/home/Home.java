package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Home extends HomePO { // All the actions that happens in the Home page should be wrapped in methods inside Home action class

    public WebElement findAgent() {
        return driver.findElement(By.xpath("//*[@data-for=\"findanagent\"]"));
    }

    public void clickFindAgent(){
        findAgent().click();
    }

    public boolean zipCodeIsDisplayed() {
        return zipCodefield().isDisplayed();
    }


}
