package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Youtube extends PageBase{
    public Youtube(WebDriver driver) {
        super(driver);
    }



    public By logo = By.id("logo-icon");


    public By assertlogooo () {
        return logo;

    }
}
