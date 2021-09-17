package automation.steps.GENERAL_METHOD.CART;

import component_Message.ComponentMessages;
import cucumber.api.java.en.And;
import divcostants.constantsP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import world.calzedoniaWorld;

public class prova_cart {

    public prova_cart prova_cart;
    public calzedoniaWorld calzedoniaWorld;


    @And("^click su cart$")
    public void clickCartButton() throws Exception {
        Thread.sleep(3000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.CART_PAGE_BUOTTON)).click();
        Thread.sleep(3000);
        String currentURL = calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp = false;
        if (currentURL.equals(constantsP.CART_PAGE_URL)) {
            tmp = true;
        } else {
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }

    }


    @And("^click vai a wishlist$")
    public void clickWishlist() throws Exception {
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.VAI_ALLA_WISHLIST_CART_BUTTON)).click();
        Thread.sleep(3000);
        String currentURL = calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp = false;
        if (currentURL.equals(constantsP.WISHLIST_PAGE_URL)) {
            tmp = true;
        } else {
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }


    @And("^click inizia lo shopping cart$")
    public void clickShopping() throws Exception {
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.INIZIA_LO_SHOPPING_CART_BUTTON)).click();
        Thread.sleep(3000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.PAGE_AFTER_CLICK_I_L_S)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }

//    @And("^cancella prodotto$")
//    public void cancellaProdotto() throws Exception {
//        Thread.sleep(2000);
//        calzedoniaWorld.driver.findElement(By.xpath(constantsP.CESTINO_BUTTON)).click();
//        Thread.sleep(2000);
//        calzedoniaWorld.driver.findElement(By.xpath(constantsP.EMILIMINA_BUTTON)).click();
//    }

    @And("^cancella prodotto$")
    public void cancellaProdotto() throws Exception {
        Thread.sleep(2000);
                //isDisplayed() verifica se l'elemento è visibile su schermo, restituisce un booleano.
                //SERVE QUANDO è PRESENTE UN SOLO ELEMENTO O PIU ELEMENTI DA ELIMINARE
        try {
            boolean cestino = calzedoniaWorld.driver.findElement(By.xpath(constantsP.CESTINO_BUTTON)).isDisplayed();
            while (cestino=true) {
                Thread.sleep(2000);
                calzedoniaWorld.driver.findElement(By.xpath(constantsP.CESTINO_BUTTON)).click();
                Thread.sleep(2000);
                calzedoniaWorld.driver.findElement(By.xpath(constantsP.EMILIMINA_BUTTON)).click();
            }
        }
        catch (Exception e)
        {

        }






    }


//    @And("^provaData")
//    public String generateXpathWithContains(String htmlElem, String attributeType, String attributeValue) {
//        String result = "//" + htmlElem + "[contains(" + attributeType + ", '" + attributeValue + "')]";
//        System.out.println("XPATH WITH CONTAINS: " + result);
//        return result;
//    }
//
//    @And("^provaData")
//    public void findAndSelectYearBirthday(String textMessage) throws Exception {
//        try{
//            WebElement element = calzedoniaWorld.driver.findElement(By.cssSelector(constantsP.VAL));
//            Actions actions = new Actions(calzedoniaWorld.driver);
//            actions.moveToElement(element);
//            actions.perform();
//            element.click();
//        } catch (Exception e) {
//            throw new Exception(textMessage + "\n" + e.getMessage() + " [Year Selection]");
//        }
//
//    }
//     //loginRegistrationManager.findAndSelectYearBirthday(ComponentMessages.DROP_DOWN_DATA_REGISTRATION_NOT_EXIST);


}
