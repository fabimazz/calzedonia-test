package automation.steps.DONNA;

import component_Message.ComponentMessages;
import cucumber.api.java.en.And;
import divcostants.constantsP;
import org.openqa.selenium.By;
import world.calzedoniaWorld;

public class donna_sladi {

    public donna_sladi donna_sladi;
    public calzedoniaWorld calzedoniaWorld;



    @And("^I click DONNA$")
    public void clickDonnaButton() throws Exception {
        Thread.sleep(3000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.DONNA_BUTTON)).click();
        Thread.sleep(2000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.DONNA_URL)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }

        @And("^I click saldi DONNA$")
        public void clickSaldiButtonDonna() throws Exception {
            calzedoniaWorld.driver.findElement(By.xpath(constantsP.SALDI_BUTTON)).click();
            Thread.sleep(2000);
            String currentURL=calzedoniaWorld.driver.getCurrentUrl();
            boolean tmp=false;
            if(currentURL.equals(constantsP.SALDI_DONNA_URL)){
                tmp=true;
            }
            else{
                throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
            }
        }

        @And("^click beachwear$")
        public void clickCategory() throws Exception {
            calzedoniaWorld.driver.findElement(By.xpath(constantsP.BEACHWEAR_BUTTON)).click();
            Thread.sleep(2000);
            String currentURL=calzedoniaWorld.driver.getCurrentUrl();
            boolean tmp=false;
            if(currentURL.equals(constantsP.BEACHWEAR_URL)){
                tmp=true;
            }
            else{
                throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
            }
        }

        @And("^click ABITO$")
        public void clickProdotto() throws Exception {
            calzedoniaWorld.driver.findElement(By.xpath(constantsP.ARTICOLO_DONNA_SALDI_BUTTON)).click();
            Thread.sleep(2000);
            String currentURL=calzedoniaWorld.driver.getCurrentUrl();
            boolean tmp=false;
            if(currentURL.equals(constantsP.ARTICOLO_DONNA_SALDI_URL)){
                tmp=true;
            }
            else{
                throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
            }
        }




}


