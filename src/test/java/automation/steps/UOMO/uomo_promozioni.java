package automation.steps.UOMO;

import automation.steps.GENERAL_METHOD.CART.prova_cart;
import automation.steps.GENERAL_METHOD.CART.prova_checkout;
import component_Message.ComponentMessages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import divcostants.constantsP;
import org.openqa.selenium.By;
import world.calzedoniaWorld;

public class uomo_promozioni {

    public uomo_promozioni uomo_promozioni;

        public automation.steps.GENERAL_METHOD.CART.prova_checkout prova_checkout;
        public world.calzedoniaWorld calzedoniaWorld;



        @And("^click promozioni$")
        public void clickPromozioni() throws Exception {
            //promozioni
            Thread.sleep(2000);
            calzedoniaWorld.driver.findElement(By.xpath(constantsP.PROMOZIONI_BUTTON)).click();
        }



    @And("^click promozione 1$")
    public void clickPromozione1() throws InterruptedException {
        //promozione 1 \
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.PROMOZIONE_1_BUTTON)).click();
    }


    @And("^vedo pagina promozione")
    public void iSeePromotionPage() throws Exception {
        Thread.sleep(3000);
        String currentUrl=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentUrl.contains(constantsP.PROMOZIONE_1_URL)) {
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }



}
