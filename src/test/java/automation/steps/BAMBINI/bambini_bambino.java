package automation.steps.BAMBINI;

import component_Message.ComponentMessages;
import cucumber.api.java.en.And;
import divcostants.constantsP;
import org.openqa.selenium.By;

public class bambini_bambino {

    public bambini_bambina bambini_bambina;
    public world.calzedoniaWorld calzedoniaWorld;


    @And("^click bambino$")
    public void clickBambino() throws Exception {
        Thread.sleep(6000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.BAMBINO_BUTTON)).click();
        Thread.sleep(2000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.BAMBINO_URL)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }

    @And("^click calze lunghe BAMBINO")
    public void clickCalzeLungheBambino() throws Exception {
        Thread.sleep(6000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.CALZE_LUNGE_BAMBINO_BUTTON)).click();
        Thread.sleep(2000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.CALZE_LUNGE_BAMBINO_URL)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }

    @And("^click prodotto calze lunghe BAMBINO")
    public void clickProdottoCalzeLungheBambino() throws Exception {
        Thread.sleep(6000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.PRODOTTO_CALZE_LUNGHE_BAMBINO_BUTTON)).click();
        Thread.sleep(2000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.PRODOTTO_CALZE_LUNGHE_BAMBINO_URL)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }


    @And("^select color calze lunghe BAMBINO")
    public void selectColorCalzeLungheBambino() throws InterruptedException {
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.COLORE2_CALZE_CORTE_BAMBINO)).click();
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.COLORE1_CALZE_CORTE_BAMBINO)).click();

    }


    @And("^select size calze lunghe BAMBINO")
    public void selectSizeCalzeLungheBambino() throws InterruptedException {
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.SIZE1_CALZE_CORTE_BAMBINO)).click();
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.SIZE2_CALZE_CORTE_BAMBINO)).click();

    }





}
