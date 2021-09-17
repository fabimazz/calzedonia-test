package automation.steps.DONNA;

import automation.steps.GENERAL_METHOD.metodi_univarsali;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import divcostants.constantsP;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import world.calzedoniaWorld;

import javax.swing.*;
import java.io.File;

public class prova_donna {

    public prova_donna prova_donna;
    public world.calzedoniaWorld calzedoniaWorld;





    @When("^pass leggings DONNA$")
    public void clickLeggings() throws Exception {
        //simula il passaggio del mouse su un elemento senza cliccare(menù scriptato)
        Actions actions=new Actions(calzedoniaWorld.driver);
        Thread.sleep(2000);
        WebElement mouse = calzedoniaWorld.driver.findElement(By.xpath(constantsP.LEGGINGS_BUTTON));
        actions.moveToElement(mouse);
        actions.perform();
    }

    @And("^click jeansMENU$")
    public void clickjeans() throws Exception {
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.JEANS_BUTTON_MENU)).click();
    }


    @And("^get title$")
    public void getTitle() throws Exception {
        Thread.sleep(2000);
        String title = calzedoniaWorld.driver.getTitle();
        System.out.println(title);
    }



}
