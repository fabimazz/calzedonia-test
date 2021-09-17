package automation.steps.GENERAL_METHOD.CART;

import cucumber.api.java.en.And;
import divcostants.constantsP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import world.calzedoniaWorld;

public class prova_checkout_2 {




    public prova_checkout_2 prova_checkout_2;
    public calzedoniaWorld calzedoniaWorld;
    public prova_cart  cart = new prova_cart();


    @And("^select shipment2$")
    public void clickProcediCeck() throws Exception {
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.MOD_SPED_1)).click();
        //PROCEDI
        Thread.sleep(1000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.PROCEDI_CHECKOUT_BUTTON)).click();
    }

    @And("^inserci altri dati$")
    public void insertAltriDati() throws Exception {

        //INDIRIZZO CHECKOUT
        Thread.sleep(5000);
        WebElement fieldIndirizzo=calzedoniaWorld.driver.findElement(By.xpath(constantsP.FIELD_INDIZIZZO_CHECKOUT));
        Thread.sleep(1000);
        fieldIndirizzo.clear();
        Thread.sleep(1000);
        fieldIndirizzo.sendKeys(constantsP.INSERISCI_FIELD_INDIZIZZO);
        Thread.sleep(3000);

        //AZIENDA,PIANO,SCALA,ALTRO CHECKOUT
        WebElement fieldPos=calzedoniaWorld.driver.findElement(By.xpath(constantsP.FIELD_AZIENDA_CHECKOUT));
        Thread.sleep(1000);
        fieldPos.clear();
        Thread.sleep(1000);
        fieldPos.sendKeys(constantsP.INSERISCI_AZIENDA_CHECKOUT);


        //CITTA CHECKOUT
        WebElement fieldCitta=calzedoniaWorld.driver.findElement(By.xpath(constantsP.FIELD_AZIENDA_CHECKOUT));
        Thread.sleep(1000);
        fieldCitta.clear();
        Thread.sleep(1000);
        fieldCitta.sendKeys(constantsP.INSERISCI_AZIENDA_CHECKOUT);


        //CAP CHECKOUT
        WebElement fieldCap=calzedoniaWorld.driver.findElement(By.xpath(constantsP.FIELD_CAP_CHECKOUT));
        Thread.sleep(1000);
        fieldCap.clear();
        Thread.sleep(1000);
        fieldCap.sendKeys(constantsP.INSERISCI_CAP_CHECKOUT);


        //PROVINCIA_CHECOUT
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.PROVINCIA_BUTTON_CHECHOUT)).click();
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.SELECT_PROVINCIA_CHECHOUT)).click();


        //PAESE CHECKOUT
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.PAESE_BUTTON_CHECKOUT)).click();
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.SELECT_BUTTON_CHECKOUT)).click();


        //PROCEDI
        Thread.sleep(7000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.PROCEDI_CHECKOUT_BUTTON)).click();
    }




}
