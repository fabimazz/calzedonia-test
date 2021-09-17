package automation.steps.BAMBINI;

import component_Message.ComponentMessages;
import cucumber.api.java.en.And;
import divcostants.constantsP;
import org.openqa.selenium.By;

public class bambini_bambina {

    public bambini_bambina bambini_bambina;
    public world.calzedoniaWorld calzedoniaWorld;



    @And("^click bambina$")
    public void clickbAMBINA() throws Exception {
        Thread.sleep(6000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.BAMBINA_BUTTON)).click();
        Thread.sleep(2000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.BAMBINA_URL)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }


    @And("^click calze corte bambina$")
    public void clickCalzeCorteBambina() throws Exception {
        Thread.sleep(6000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.CALZE_CORTE_BAMBINA_BUTTON)).click();
        Thread.sleep(2000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.CALZE_CORTE_BAMBINA_URL)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }



    @And("^click su prodotto calze corte bambina$")
    public void clickProdottoCalzeCorteBambina() throws Exception {
        Thread.sleep(6000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.ARTICOLO_CALZE_CORTE_BAMABINA_BUTTON)).click();
        Thread.sleep(2000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.ARTICOLO_CALZE_CORTE_URL)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }


    @And("^select type calza corta bambina$")
    public void selectTipeCalzaCortaBambina() throws InterruptedException {
        Thread.sleep(3000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.TIPO2_C_C_BAMBINE)).click();
        Thread.sleep(3000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.TIPO1_C_C_BAMBINE)).click();

    }
    @And("^select age calza corta bambina$")
    public void selecAgeCalzaCortaBambina() throws InterruptedException {
        Thread.sleep(3000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.ETA1_C_C_BAMBINE)).click();
        Thread.sleep(3000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.ETA2_C_C_BAMBINE)).click();

    }









}
