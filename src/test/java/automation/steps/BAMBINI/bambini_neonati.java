package automation.steps.BAMBINI;

import component_Message.ComponentMessages;
import cucumber.api.java.en.And;
import divcostants.constantsP;
import org.openqa.selenium.By;
import world.calzedoniaWorld;

public class bambini_neonati {

    public bambini_neonati bambini_neonati;
    public calzedoniaWorld calzedoniaWorld;


    @And("^click neonato BAMBINI$")
    public void clickNeonatoBambini() throws Exception {
        Thread.sleep(6000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.NEONATO_BUTTON)).click();
        Thread.sleep(2000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.NEONATO_URL)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }


    @And("^click calze neonato BAMBINI$")
    public void clickCalzeNeonatoBambini() throws Exception {
        Thread.sleep(6000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.CALZE_NEONATO_BUTTON)).click();
        Thread.sleep(2000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.CALZE_NEONATO_URL)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }

    @And("^click prodotto calze neonato BAMBINI$")
    public void clickProdottoCalzeNeonatoBambini() throws Exception {
        Thread.sleep(6000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.PRODOTTO_CALZE_NEONATO)).click();
        Thread.sleep(2000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.PRODOTTO_CALZE_NEONATO_URL)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }


    @And("^select type calze neonato BAMBINI$")
    public void selectTypeCalzeNeonatoBambini() throws Exception {
        Thread.sleep(3000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.TIPO2_CALZE_NEONATO)).click();
        Thread.sleep(3000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.TIPO1_CALZE_NEONATO)).click();
    }


    @And("^select size calze neonato BAMBINI$")
    public void selectSizeCalzeNeonatoBambini() throws Exception {
        Thread.sleep(3000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.SIZE1_CALZE_NEONATO)).click();
        Thread.sleep(3000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.SIZE2_CALZE_NEONATO)).click();
    }


}
