package automation.steps.GENERAL_METHOD;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import divcostants.constantsP;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import world.calzedoniaWorld;

import java.io.File;

public class metodi_univarsali {

    public metodi_univarsali metodi_univarsali;
    public calzedoniaWorld calzedoniaWorld;





    @And("^add quantity$")
    public void clickPlusButton() throws Exception {
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.PLUS_BUTTON)).click();
    }

    @And("^remove quantity$")
    public void clickMenoButton() throws Exception {
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.MENO_BUTTON)).click();
    }

    @Then("^aggiungi al carrello$")
    public void addInCarrello() throws Exception {
        Thread.sleep(3000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.AGGIUNGI_BUTTON)).click();
    }


    @And("^aggiungi alla wishlist$")
    public void addInWishlist() throws Exception {
        Thread.sleep(10000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.WISHLIST_BUTTON)).click();
    }



    @Then("^i see if element add to cart popup$")
    public void controlloCarrelloPopup() throws Exception {
        Thread.sleep(5000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.CONTROLLO_POPUP));

    }



    @When("^stampa$")
    public void stampa() throws Exception {
        Thread.sleep(2000);
        boolean stamp = calzedoniaWorld.driver.findElement(By.xpath(constantsP.STAMPA)).isEnabled();
        System.out.println(stamp);
    }


    @And("^screenshot$")
    public void faiFoto() throws Exception {
        Thread.sleep(3000);
        File shot = ((TakesScreenshot)calzedoniaWorld.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(shot, new File("C:\\Users\\fabio\\Downloads\\shot1.jpg"));
    }




}
