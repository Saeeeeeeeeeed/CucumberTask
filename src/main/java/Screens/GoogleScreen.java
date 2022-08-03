package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleScreen extends PageBase {
    public GoogleScreen(WebDriver driver) {
        super(driver);
    }

   // @FindBy (xpath = "//img[@alt='Google']")
  //  WebElement googlelogo;

    public By googlelogo = By.xpath("//img[@alt='Google']");

    @FindBy (xpath = "//input[@name='q']")
    WebElement googlesearch;

    public void searchengine (String words)
    {
        settextandenter(googlesearch, words);
    }
    public By assertlogo () {
        return googlelogo;
    }


}
