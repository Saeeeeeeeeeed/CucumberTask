package Screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Googleresults extends PageBase{
    public Googleresults(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div[1]/div/a/h3/span")
    WebElement utube;

    public void Clickonutube () {
        clickbutton(utube);
    }
}
