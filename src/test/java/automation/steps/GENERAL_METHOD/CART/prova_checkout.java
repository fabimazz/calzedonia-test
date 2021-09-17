package automation.steps.GENERAL_METHOD.CART;

import component_Message.ComponentMessages;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import divcostants.constantsP;
import org.apache.avro.specific.TestSpecificDatumReader;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import world.calzedoniaWorld;

import java.nio.file.WatchEvent;
import java.util.ArrayList;

public class prova_checkout {

    public prova_checkout prova_checkout;
    public calzedoniaWorld calzedoniaWorld;
    public prova_cart  cart = new prova_cart();


    @And("^click procedi checkout$")
    public void clickProcediCeck() throws Exception {

        //CODICE PROMOZIONALE
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.CODICE_PROMOZIONALE_BUTTON)).click();
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.FIELD_PROMOZIONALE)).sendKeys(constantsP.COD_PROM_INSERT);

        //VAI AL CHECKOUT
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.PROCEDI_CART_BUTTON)).click();
    }

    @Then("^vedo pagina checkout$")
    public void paginaCheck() throws Exception {
        Thread.sleep(3000);
        String currentUrl=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentUrl.contains(constantsP.PROCEDI_CART_URL)) {
            tmp=true;
     }
        else{
        throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }



    @When("^select shipment$")
    public void selectShipment() throws Exception {

        //SPEDIZIONE
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.MOD_SPED_2)).click();
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.MOD_SPED_1)).click();
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.MOD_SPED_3)).click();
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.TROVA_NEGOZIO)).click();
        Thread.sleep(5000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.FIELD_TROVA_NEGOZIO)).sendKeys(constantsP.INSERT_CITTA);
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.SELECT_CITTA_BUTTON)).click();
        Thread.sleep(7000);

        //PROCEDI
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.PROCEDI_CHECKOUT_BUTTON)).click();
    }


    @And("^inserisci tutti i dati$")
    public void insertDati() throws Exception {

        //NOME CHECKOUT
        Thread.sleep(5000);
        WebElement fieldNome=calzedoniaWorld.driver.findElement(By.xpath(constantsP.FIELD_NOME_CHECKOUT));
        Thread.sleep(1000);
        fieldNome.clear();
        Thread.sleep(1000);
        fieldNome.sendKeys(constantsP.INSERISCI_NOME_CHECKOUT);
        Thread.sleep(3000);

        //COGNOME CHECKOUT
        WebElement fieldCognome=calzedoniaWorld.driver.findElement(By.xpath(constantsP.FIELD_COGNOME_CHECKOUT));
        Thread.sleep(1000);
        fieldCognome.clear();
        Thread.sleep(1000);
        fieldCognome.sendKeys(constantsP.INSERISCI_COGNOME_CHECKOUT);

//        //PROCEDI
//        Thread.sleep(7000);
//        calzedoniaWorld.driver.findElement(By.xpath(constantsP.PROCEDI_CHECKOUT_BUTTON)).click();
    }

    @And("^inserisci dati carta$")
    public void insertDatiCard() throws Exception {

        //nome carta
        Thread.sleep(3000);
        WebElement fieldNome=calzedoniaWorld.driver.findElement(By.xpath(constantsP.FIELD_NOME_CARTA));
        Thread.sleep(1000);
        fieldNome.clear();
        Thread.sleep(1000);
        fieldNome.sendKeys(constantsP.INSERT_NOME_CARTA);

        //numero carta
        Thread.sleep(3000);
        WebElement fieldNumeroCarta=calzedoniaWorld.driver.findElement(By.xpath(constantsP.FIELD_NUMERO_CARTA));
        Thread.sleep(1000);
        fieldNumeroCarta.clear();
        Thread.sleep(1000);
        fieldNumeroCarta.sendKeys(constantsP.INSERT_NUMERO_CARTA);

        //mese scadenza
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.MESE)).click();
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.SELECT_MESE)).click();

        //anno scadenza
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.ANNO)).click();
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.SELECT_ANNO)).click();

        //CVV
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.CVV)).sendKeys(constantsP.INSERT_CVV);


    }


    @And("^submit payment$")
    public void submitPayiment() throws Exception {

        //ACCETTA TERMINI
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.TERMINI_BUTTON)).click();

        //SUBMIT PAYMENT
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.SUBMIT_PAYMENT_BUTTON)).click();
    }


//
//    @And("^seleziona mese$")
//    public void selezionaMese() throws Exception {
//        Thread.sleep(2000);
//        calzedoniaWorld.driver.findElement(By.xpath(constantsP.MESE)).click();
//        Thread.sleep(2000);
//        Select trova = new Select(calzedoniaWorld.driver.findElement(By.id("expirationMonth")));
//        Thread.sleep(3000);
//        //trova.selectByVisibleText("02");
//        //trova.selectByIndex(2);
//        trova.selectByValue("2");
//
//        //cart.findAndSelectYearBirthday("samuele va via");
//
//
//    }




}
