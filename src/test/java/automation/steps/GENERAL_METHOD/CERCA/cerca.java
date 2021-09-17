package automation.steps.GENERAL_METHOD.CERCA;

import component_Message.ComponentMessages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import divcostants.constantsP;
import org.openqa.selenium.By;
import world.calzedoniaWorld;

public class cerca {

    public cerca cerca;
    public calzedoniaWorld calzedoniaWorld;



    @When("^click cerca and insert key$")
    public void clickCerca() throws Exception{
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.CERCA_BUTTON)).sendKeys(constantsP.INSERISCI_RICERCA);
    }



    @Then("^i see page search$")
    public void iSeePageSearch() throws Exception{
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.VEDI_TUTTI_CERCA_BAMBINI)).click();
        Thread.sleep(2000);
        String currentUrl = calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp = false;
        if (currentUrl.contains(constantsP.VEDI_TUTTI_URL)){
            tmp = true;
        }
        else {
            throw new Exception(ComponentMessages.PAGE_MY_AREA_ERROR);
        }
    }

    @Then("^i see page prodotto$")
    public void iSeePageProdotto() throws Exception{
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.PRODOTTO_1_CERCA)).click();
        Thread.sleep(2000);
        String currentUrl = calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp = false;
        if (currentUrl.contains(constantsP.PRODOTTO_1_CERCA_URL)){
            tmp = true;
        }
        else {
            throw new Exception(ComponentMessages.PAGE_MY_AREA_ERROR);
        }
    }






}
