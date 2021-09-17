package automation.steps.UOMO;

import component_Message.ComponentMessages;
import cucumber.api.java.en.And;
import divcostants.constantsP;
import org.openqa.selenium.By;
import world.calzedoniaWorld;

public class uomo_calze {

    public uomo_calze uomo_calze;
    public calzedoniaWorld calzedoniaWorld;




    @And("^click calze$")
    public void clickCalze() throws Exception {
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.CALZE_BUTTON)).click();
        Thread.sleep(4000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.CALZE_URL)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }

    @And("^click pedulini$")
    public void clickPedulini() throws Exception {
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.PEDULINI_BUTTON)).click();
        Thread.sleep(4000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.PEDULINI_URL)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }


    @And("^click prodotto calze UOMO$")
    public void clickProdottoCalze() throws Exception {
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.PRODOTTO_PEDULINI_BUTTON)).click();
        Thread.sleep(4000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.PRODOTTO_PEDULINI_URL)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }


    @And("^select color$")
    public void selectModel() throws Exception {
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.COLORE_PEDULINI_2)).click();
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.COLORE_PEDULINI_1)).click();
    }


    @And("^select size$")
    public void selectSize() throws Exception {
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.TAGLIA_PEDULINI_1)).click();
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.TAGLIA_PEDULINI_2)).click();
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.TAGLIA_PEDULINI_3)).click();
    }














}
