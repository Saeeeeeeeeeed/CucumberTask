package Screens;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

    protected WebDriver driver;

    public PageBase (WebDriver driver) {               //constructor
        PageFactory.initElements(driver, this);
    }

    protected static void clickbutton (WebElement button) { button.click();}


    protected static void settextandenter (WebElement textElement, String value){
        textElement.sendKeys(value);
        textElement.sendKeys(Keys.ENTER);
    }

}
