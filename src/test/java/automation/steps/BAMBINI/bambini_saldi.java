package automation.steps.BAMBINI;

import component_Message.ComponentMessages;
import cucumber.api.java.en.And;
import divcostants.constantsP;
import org.openqa.selenium.By;
import world.calzedoniaWorld;

public class bambini_saldi {

    public bambini_saldi bambini_saldi;
    public calzedoniaWorld calzedoniaWorld;


    @And("^click BAMBINI$")
    public void clickBambiniButton() throws Exception {
        Thread.sleep(6000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.BAMBINI_BUTTON)).click();
        Thread.sleep(2000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.BAMBINI_URL)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }

    @And("^click saldi BAMBINI$")
    public void clickSaldiButtonBambini() throws Exception {
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.SALDI_BUTTON)).click();
        Thread.sleep(2000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.SALDI_BAMBINI_URL)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }


    @And("^click Calzini BAMBINI$")
    public void clickCalziniBambini() throws Exception {
        Thread.sleep(6000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.BAMBINI_CALZINI_BUTTON)).click();
        Thread.sleep(2000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.BAMBINI_CALZINI_URL)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }

    @And("^click prodotto BAMBIBNI$")
    public void clickProdottoBambini() throws Exception {
        Thread.sleep(6000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.ARTICOLO_BAMBINI_BUTTON)).click();
        Thread.sleep(2000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.ARTICOLO_BAMBINI_URL)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }

//    @Then("^i see if element add to cart popup$")
//    public void controlloCarrelloPopup() throws Exception {
//        Thread.sleep(1500);
//        calzedoniaWorld.driver.findElement(By.xpath(constantsP.POPUP_CARRELLO));
//        Thread.sleep(1500);
//        boolean tmp=false;
//        if(constantsP.POPUP_CARRELLO.contains(constantsP.CONTROL_POP)){
//            tmp=true;
//        }
//        else{
//            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
//        }
//    }

























































}
