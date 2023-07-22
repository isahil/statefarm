import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import home.Home;
public class SearchAgent {

    Home home = new Home();

    @BeforeSuite()
    public void startUp(){
        home.setUp("");
    }

    @AfterTest()
    public void quit(){
        home.tearDown();
    }


    @Test
    public void homePageTitle(){
        String title = home.driver.getTitle();
        Assert.assertEquals("State Farm Insurance Companies | Like a Good Neighbor | State Farm®", title);
    }

    @Test
    public void clickFindAnAgent() {
        home.clickFindAgent();
        boolean zipCode = home.zipCodeIsDisplayed();
        Assert.assertTrue(zipCode);
    }



}
