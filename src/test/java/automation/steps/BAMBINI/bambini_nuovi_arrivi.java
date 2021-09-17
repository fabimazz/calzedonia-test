package automation.steps.BAMBINI;

import component_Message.ComponentMessages;
import cucumber.api.java.en.And;
import divcostants.constantsP;
import org.openqa.selenium.By;
import world.calzedoniaWorld;

public class bambini_nuovi_arrivi {

    public bambini_nuovi_arrivi  bambini_nuovi_arrivi;
    public calzedoniaWorld calzedoniaWorld;

    @And("^click nuovi arrivi BAMBINI$")
    public void clickProdottoBambini() throws Exception {
        Thread.sleep(6000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.NUOVI_ARRIVI_BAMBINI_BUTTON)).click();
        Thread.sleep(2000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.NUOVI_ARRIVI_BAMBINI_URL)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }

    @And("^click prodotto nuovi arrivi BAMBINI$")
    public void prodottoNuoviArriviBAMBINIi() throws Exception {
        Thread.sleep(6000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.PRODOTTO_NUOVI_ARRIVI_BAMBINO_BUTTON)).click();
        Thread.sleep(2000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.PRODOTTO_NUOVI_ARRIVI_BAMBINO_URL)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }


    @And("^seleziono tipo$")
    public void selezionoTipo() throws InterruptedException {
        Thread.sleep(3000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.TIPO2_N_A_BAMBINI)).click();
        Thread.sleep(3000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.TIPO1_N_A_BAMBINI)).click();
    }

    @And("^seleziono eta$")
    public void selezionoEta() throws InterruptedException {
        Thread.sleep(3000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.ANNI1_N_A_BAMBINI)).click();
        Thread.sleep(3000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.ANNI2_N_A_BAMBINI)).click();
    }

















}
