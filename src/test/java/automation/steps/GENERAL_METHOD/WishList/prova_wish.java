package automation.steps.GENERAL_METHOD.WishList;

import component_Message.ComponentMessages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import divcostants.constantsP;
import org.openqa.selenium.By;
import world.calzedoniaWorld;

public class prova_wish {

    public prova_wish prova_wish;
    public calzedoniaWorld calzedoniaWorld;


    @And("^click wisklist button$")
    public void clickWishlistButtonHome() throws Exception {
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.WISHLIST_PAGE_BUTTON)).click();
        Thread.sleep(2000);
        String currentURL=calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp=false;
        if(currentURL.equals(constantsP.WISHLIST_PAGE_URL)){
            tmp=true;
        }
        else{
            throw new Exception(ComponentMessages.URL_RECEIVED_NULL);
        }
    }

    @And("^click inizia lo shopping$")
    public void clickIniziaShopping() throws Exception {
        Thread.sleep(2000);
        calzedoniaWorld.driver.findElement(By.xpath(constantsP.INIZA_LO_SHOPPING_BUTTON)).click();
        Thread.sleep(2000);
        String currentUrl = calzedoniaWorld.driver.getCurrentUrl();
        boolean tmp = false;
        if (currentUrl.equals(constantsP.PAGE_AFTER_CLICK_I_L_S)){
            tmp = true;
        }
        else {
            throw new Exception(ComponentMessages.PAGE_MY_AREA_ERROR);
        }
    }






}
