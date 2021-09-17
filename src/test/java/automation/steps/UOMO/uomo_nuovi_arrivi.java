package automation.steps.UOMO;

import component_Message.ComponentMessages;
import cucumber.api.java.en.And;
import divcostants.constantsP;
import org.openqa.selenium.By;
import world.calzedoniaWorld;

public class uomo_nuovi_arrivi {

    public uomo_nuovi_arrivi uomo_nuovi_arrivi;
    public calzedoniaWorld calzedoniaWorld;



    @And("^click nuovi arrivi UOMO$")
    public void clickUomoNuoviArrivi() throws Exception {
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.NUOVI_ARRIVI_BUTTON)).click();
        Thread.sleep(4000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.NUOVI_ARRIVI_URL)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }


    @And("^click prodotto nuovi arrivi UOMO$")
    public void clickCalzeBatman() throws Exception {
        Thread.sleep(4000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.PRODOTTO_CALZE_NUOVI_ARRIVI_BUTTON)).click();
        Thread.sleep(2000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.PRODOTTO_CALZE_NUOVI_ARRIVI_URL)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }

    @And("^multiswipe calzini$")
    public void clickCalzinoVari() throws Exception {
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.CALZE_NUOVI_ARRIVI_2)).click();
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.CALZE_NUOVI_ARRIVI_3)).click();
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.CALZE_NUOVI_ARRIVI_4)).click();
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.CALZE_NUOVI_ARRIVI_1)).click();


    }



}
