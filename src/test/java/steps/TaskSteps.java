package steps;

import Screens.GoogleScreen;
import Screens.Googleresults;
import Screens.Youtube;
import Test.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TaskSteps extends TestBase {
Googleresults googleresultobject;
GoogleScreen googlescreenobject;
Youtube youtubeobject;
    @Given(": user in google page search for youtube")
    public void user_in_google_page_search_for_youtube() {
        googlescreenobject =new GoogleScreen(driver);

      Assert.assertNotNull(googlescreenobject.assertlogo());



    }
    @When(": user search for youtube")
    public void user_search_for_youtube() {
        googlescreenobject =new GoogleScreen(driver);
        googlescreenobject.searchengine("Youtube");
        googleresultobject = new Googleresults(driver);
        googleresultobject.Clickonutube();

    }
    @Then(": user get youtube page")
    public void user_get_youtube_page() {
        youtubeobject = new Youtube(driver);
        youtubeobject.assertlogooo();

        Assert.assertNotNull(youtubeobject.assertlogooo());

    }


}
