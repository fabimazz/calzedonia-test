package automation.steps.DONNA;

import component_Message.ComponentMessages;
import cucumber.api.java.en.When;
import divcostants.constantsP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import world.calzedoniaWorld;

public class donna_jeans {


    public  donna_jeans donna_jeans;


    @When("^click leggings DONNA$")
    public void clickLeggings() throws Exception {
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.LEGGINGS_BUTTON)).click();
    }




    @When("^click jeans DONNA$")
    public void clickJeans() throws Exception {
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.JEANS_BUTTON)).click();

    }

    @When("^vedo la pagina jeans DONNA$")
    public void vedoPagina() throws Exception {
        Thread.sleep(3000);
        String currentUrl = calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp = false;
        if (currentUrl.contains(constantsP.JEANS_URL)) {
            tmp = true;
        } else {
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }

    @When("^click prodotto jeans DONNA$")
    public void selectProd() throws Exception {
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.JEANS_PRODOTTO_BUTTON)).click();
        Thread.sleep(3000);
        String currentUrl = calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp = false;
        if (currentUrl.contains(constantsP.JEANS_PRODOTTO_URL)) {
            tmp = true;
        } else {
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }



}
