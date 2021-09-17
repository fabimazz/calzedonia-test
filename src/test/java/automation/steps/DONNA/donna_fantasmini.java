package automation.steps.DONNA;

import automation.steps.UOMO.uomo_promozioni;
import component_Message.ComponentMessages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import divcostants.constantsP;
import org.openqa.selenium.By;
import world.calzedoniaWorld;

public class donna_fantasmini {

    public  donna_fantasmini donna_fantasmini;
        public automation.steps.GENERAL_METHOD.CART.prova_checkout prova_checkout;
        public calzedoniaWorld calzedoniaWorld;



        @When("^click calze DONNA$")
        public void clickCalze() throws Exception {
            //promozioni
            Thread.sleep(2000);
            calzedoniaWorld.driver.findElement(By.xpath(constantsP.CALZE_DONNA_BUTTON)).click();
            Thread.sleep(3000);
            String currentUrl=calzedoniaWorld.driver.getCurrentUrl();
            boolean tmp=false;
            if(currentUrl.contains(constantsP.CALZE_DONNA_URL)) {
                tmp=true;
            }
            else{
                throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
            }
        }


    @And("^click fantasmini DONNA$")
    public void clickFantasminiCategory() throws Exception {
        //promozioni
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.FANTASMINI_DONNA_BUTTON)).click();
        Thread.sleep(3000);
        String currentUrl=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentUrl.contains(constantsP.FANTASMINI_DONNA_URL)) {
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }

    @Then("^click prodotto fantasmini DONNA$")
    public void clickProdottoFantasminiDonna() throws Exception {
        //promozioni
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.PRODOTTO_FANTASMINI_DONNA_BUTTON)).click();
        Thread.sleep(3000);
        String currentUrl=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentUrl.contains(constantsP.PRODOTTO_FANTASMINI_DONNA_URL)) {
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }

    @Then("^select color fantasmini DONNA$")
    public void selectColorAndType() throws Exception {
        //promozioni
        Thread.sleep(1000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.COLOR_1_FANTASMINI_DONNA)).click();
        Thread.sleep(1000);

    }

    @And("^select size fantasmini DONNA$")
    public void selectSize() throws Exception {
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.SIZE_FANTASMINI_DONNA)).click();
    }



}


