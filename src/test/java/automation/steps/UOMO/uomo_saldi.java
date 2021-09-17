package automation.steps.UOMO;

import component_Message.ComponentMessages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import divcostants.constantsP;
import org.openqa.selenium.By;
import world.calzedoniaWorld;

public class uomo_saldi {

    public uomo_saldi uomo_saldi;
    public calzedoniaWorld calzedoniaWorld;

    @When("^I click UOMO$")
    public void clickUomoButton() throws Exception {
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.UOMO_BUTTON)).click();
        Thread.sleep(2000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.UOMO_URL)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }

    @And("^I click saldi UOMO$")
    public void clicSaldiButton() throws Exception {
        Thread.sleep(3000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.SALDI_BUTTON_UOMO)).click();
        Thread.sleep(2000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.SALDI_UOMO_URL)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }



    @And("^I click calzini corti$")
    public void clicCalziniCorti() throws Exception {
        calzedoniaWorld.driver.findElement(By.cssSelector(constantsP.CALZINI_CORTI_UOMO_BUTTON)).click();
        Thread.sleep(2000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.CALZINI_CORTI_UOMO_URL)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }


    @And("^I click primo articolo$")
    public void clickPrimoArticolo() throws Exception {
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.ARTICOLO_UOMO_SALDI_BUTTON)).click();
        Thread.sleep(2000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.ARTICOLO_UOMO_SALDI_URL)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }

    }




















//
//    @When("^I click BAMBINI$")
//    public void clickBambiniButton() throws Exception {
//        calzedoniaWorld.driver.findElement(By.xpath(constantsP.UOMO_BUTTON)).click();
//        Thread.sleep(2000);
//        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
//        boolean tmp=false;
//        if(currentURL.equals(constantsP.UOMO_URL)){
//            tmp=true;
//        }
//        else{
//            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
//        }
//    }
//
//




}
